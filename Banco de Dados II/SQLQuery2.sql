-- 1. Criar Tabela Departamentos
CREATE TABLE Departamentos (
    id_depto INT PRIMARY KEY,
    nome_depto VARCHAR(100) NOT NULL
);

-- 2. Criar Tabela Professores
CREATE TABLE Professores (
    id_prof INT PRIMARY KEY,
    nome_prof VARCHAR(100) NOT NULL,
    id_depto INT,
    FOREIGN KEY (id_depto) REFERENCES Departamentos(id_depto)
);

-- 3. Criar Tabela Disciplinas
CREATE TABLE Disciplinas (
    id_disc INT PRIMARY KEY,
    nome_disc VARCHAR(100) NOT NULL,
    id_prof INT,
    creditos INT,
    FOREIGN KEY (id_prof) REFERENCES Professores(id_prof)
);

-- 4. Criar Tabela Alunos
CREATE TABLE Alunos (
    id_aluno INT PRIMARY KEY,
    nome_aluno VARCHAR(100) NOT NULL,
    cidade VARCHAR(50)
);

-- 5. Criar Tabela Matriculas
CREATE TABLE Matriculas (
    id_aluno INT,
    id_disc INT,
    nota_final DECIMAL(4,2),
    PRIMARY KEY (id_aluno, id_disc),
    FOREIGN KEY (id_aluno) REFERENCES Alunos(id_aluno),
    FOREIGN KEY (id_disc) REFERENCES Disciplinas(id_disc)
);

-- INSERINDO DADOS
-- Departamentos
INSERT INTO Departamentos VALUES (1, 'Tecnologia da Informacao');
INSERT INTO Departamentos VALUES (2, 'Matematica e Estatistica');
INSERT INTO Departamentos VALUES (3, 'Filosofia'); -- Depto sem professor (para teste de Left Join)

-- Professores
INSERT INTO Professores VALUES (10, 'Dr. Alan Turing', 1);
INSERT INTO Professores VALUES (11, 'Dra. Ada Lovelace', 1);
INSERT INTO Professores VALUES (12, 'Prof. Isaac Newton', 2);

-- Disciplinas
INSERT INTO Disciplinas VALUES (101, 'Banco de Dados', 10, 4);
INSERT INTO Disciplinas VALUES (102, 'Algoritmos Avancados', 10, 6);
INSERT INTO Disciplinas VALUES (103, 'Colculo I', 12, 4);
INSERT INTO Disciplinas VALUES (104, 'Inteligencia Artificial', 11, 4);

-- Alunos
INSERT INTO Alunos VALUES (201, 'Joao Silva', 'Sao Paulo');
INSERT INTO Alunos VALUES (202, 'Maria Oliveira', 'Rio de Janeiro');
INSERT INTO Alunos VALUES (203, 'Carlos Souza', 'Sao Paulo');
INSERT INTO Alunos VALUES (204, 'Ana Costa', 'Belo Horizonte');

-- Matriculas (Notas)
INSERT INTO Matriculas VALUES (201, 101, 8.5); -- Joao em BD
INSERT INTO Matriculas VALUES (202, 101, 9.5); -- Maria em BD (Maior nota!)
INSERT INTO Matriculas VALUES (203, 101, 7.0); -- Carlos em BD
INSERT INTO Matriculas VALUES (201, 103, 6.0); -- Joao em Calculo
INSERT INTO Matriculas VALUES (204, 104, 10.0); -- Ana em IA


-- 1
SELECT nome_aluno, cidade
FROM Alunos
WHERE cidade = 'Sao Paulo';

--2
select nome_disc 
from Disciplinas
order by nome_disc;


--3
select MAX (nota_final) 
from Matriculas;

--4
select nome_aluno, nota_final
from Matriculas join 	Alunos on Matriculas.id_aluno=Alunos.id_aluno

--5
select cidade, count(*) quantidade_aluno
from Alunos
