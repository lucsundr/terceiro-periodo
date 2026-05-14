--1
CREATE FUNCTION fn_idade_media_pacientes_por_doenca()
RETURNS @resultado TABLE
(doença CHAR(40), idade_media FLOAT) AS BEGIN
    INSERT INTO @resultado
    SELECT 
        doença,
        AVG(idade) AS idade_media
    FROM Pacientes
    GROUP BY doença
    RETURN
END
SELECT * FROM fn_idade_media_pacientes_por_doenca()

--2
CREATE FUNCTION fn_custo_total_honorarios_medico(@codm INT)
RETURNS FLOAT AS BEGIN
    DECLARE @total FLOAT
    SELECT @total = SUM(p.valorPago)
    FROM Consultas c
    INNER JOIN Pagamentos p ON c.idConsulta = p.idConsulta
    WHERE c.codm = @codm
    RETURN ISNULL(@total, 0)
END
SELECT dbo.fn_custo_total_honorarios_medico(1) AS total_honorarios

--3
CREATE TRIGGER trg_verifica_idade_funcionario
ON Funcionarios
AFTER INSERT
AS
BEGIN
    IF EXISTS (SELECT 1 FROM inserted WHERE idade < 18)
    BEGIN
        RAISERROR('Não é permitido inserir funcionários com menos de 18 anos.', 16, 1)
        ROLLBACK TRANSACTION
    END
END

--teste prra ver se entra ou não por ter 16 anos
INSERT INTO Funcionarios (codf, CPF, nome, idade, cidade, salario, departamento) VALUES (67, '12345678901', 'Carlos Silva', 16, 'São Paulo', 2000, 'Administrativo')

--4
CREATE TRIGGER trg_atualiza_honorarios ON Pagamentos AFTER UPDATE AS BEGIN
    UPDATE h
    SET h.valor = i.valorPago
    FROM Honorários h
    INNER JOIN Consultas c ON c.idConsulta = idConsulta
    INNER JOIN Medicos m ON m.codm = c.codm
    INNER JOIN inserted i ON i.idConsulta = c.idConsulta
    WHERE h.especialidade = m.especialidade
END

UPDATE Pagamentos
SET valorPago = 500
WHERE idConsulta = 1

SELECT * FROM Honorários