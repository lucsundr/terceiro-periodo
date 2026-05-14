--1
CREATE VIEW vw_catalogo_filmes AS
SELECT
    titulo_principal,
    duracao_minutos,
    ano_lancamento
FROM Filmes
--teste
SELECT * FROM vw_catalogo_filmes

--2
CREATE VIEW vw_filmes_curtos AS
SELECT
    titulo_principal,
    duracao_minutos
FROM Filmes
WHERE duracao_minutos < 90
--teste
SELECT * FROM vw_filmes_curtos

--3
CREATE VIEW vw_detalhes_filmes_atores AS
SELECT
    F.titulo_principal AS Filme,
    A.nome_principal AS Ator,
    P.nome_personagem AS Personagem
FROM Filmes F
INNER JOIN Personagens P
    ON F.id_filme = P.id_filme
INNER JOIN Atores A
    ON P.id_ator = A.id_ator
--teste
SELECT * FROM vw_detalhes_filmes_atores

--4
CREATE PROCEDURE BuscarFilmePorTitulo
    @Titulo VARCHAR(200)
AS
BEGIN
    SELECT
        titulo_principal,
        duracao_minutos,
        ano_lancamento
    FROM Filmes
    WHERE titulo_principal LIKE '%' + @Titulo + '%';
END
--teste
exec BuscarFilmePorTitulo 'imposs';

--5
CREATE PROCEDURE BuscarAtoresPorAno @Ano SMALLINT
AS BEGIN
    SELECT
        nome_principal,
        ano_nascimento
    FROM Atores
    WHERE ano_nascimento = @Ano;
END
--teste
exec BuscarAtoresPorAno 1970;

--6
CREATE PROCEDURE ListarFilmesPorGenero @Genero VARCHAR(50)
AS BEGIN
    SELECT
        F.titulo_principal,
        F.ano_lancamento,
        G.genero
    FROM Filmes F
    INNER JOIN Generos G
        ON F.id_filme = G.id_filme
    WHERE G.genero = @Genero;
END
--teste
exec ListarFilmesPorGenero 'Drama'

--7
CREATE FUNCTION CalcularIdade
(@AnoNascimento SMALLINT)
RETURNS INT
AS
BEGIN
    DECLARE @Idade INT;
    SET @Idade = 2026 - @AnoNascimento;
    RETURN @Idade;
END
--teste
SELECT
    nome_principal,
    ano_nascimento,
    dbo.CalcularIdade(ano_nascimento) AS Idade
FROM Atores


--8
CREATE TRIGGER trg_auditoria_insercao_filmes ON Filmes
AFTER INSERT AS BEGIN
    INSERT INTO Auditoria (id_filme, titulo, mensagem)
    SELECT
        id_filme,
        titulo_principal,
        'titulo ' + titulo_principal + ' inserido'
    FROM inserted;
END
--teste
INSERT INTO Filmes
(id_filme, titulo_principal, duracao_minutos, ano_lancamento, tipo_titulo, eh_adulto)
VALUES
('tt9999999', 'Filme Teste Auditoria', 120, 2024, 'movie', 0);

SELECT * FROM Auditoria

--9
CREATE TRIGGER trg_validar_duracao_filme ON Filmes INSTEAD OF INSERT 
AS BEGIN
    --filmes inválidos
    IF EXISTS (
        SELECT 1
        FROM inserted
        WHERE duracao_minutos < 30
    )
    BEGIN
        INSERT INTO Auditoria (id_filme, titulo, mensagem)
        SELECT
            id_filme,
            titulo_principal,
            'Falha na inserção: Duracao menor do que 30 minutos'
        FROM inserted;

        RAISERROR('Não é permitido inserir filmes com duração menor que 30 minutos.', 16, 1);

        RETURN;
    END

    --filmes válidos
    INSERT INTO Filmes
    (
        id_filme,
        titulo_principal,
        duracao_minutos,
        ano_lancamento,
        tipo_titulo,
        eh_adulto
    )
    SELECT
        id_filme,
        titulo_principal,
        duracao_minutos,
        ano_lancamento,
        tipo_titulo,
        eh_adulto
    FROM inserted;

    --auditoria de sucesso
    INSERT INTO Auditoria (id_filme, titulo, mensagem)
    SELECT
        id_filme,
        titulo_principal,
        'Sucesso'
    FROM inserted;
END
--teste
INSERT INTO Filmes
(id_filme, titulo_principal, duracao_minutos, ano_lancamento, tipo_titulo, eh_adulto)
VALUES
('tt9999998', 'Filme Teste2 Auditoria', 20, 2024, 'movie', 0);

SELECT * FROM Auditoria