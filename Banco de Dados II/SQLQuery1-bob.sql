-- Dado o esquema acima, no seu ambiente SQL execute as seguintes consultas:
-- 1 Construa uma visão chamada “EspecialistaRJ” com médicos somente com os atributos codm, nome e especialidade daqueles médicos que moram no “Rio de Janeiro” 
DROP VIEW ESPECIALISTARJ
CREATE VIEW ESPECIALISTARJ AS
SELECT  CODM AS MATRICULA, NOME AS MEDICO, ESPECIALIDADE
FROM MEDICOS
WHERE CIDADE = 'RIO DE JANEIRO'

SELECT * FROM ESPECIALISTARJ
SELECT MATRICULA, MEDICO FROM ESPECIALISTARJ

-- 2 Construa uma visão chamada “GrupodeRisco” da tabela pacientes, com os campos nome, doença, cidade que tem como doenças “Pneumonia”, “Hipertensão” ou “Gripe”
CREATE VIEW vGrupodeRisco AS
SELECT nome AS paciente, doença, cidade
FROM pacientes 
WHERE doença IN ('Pneumonia','Hipertencao','Gripe')

SELECT * FROM vGrupodeRisco

-- 3 Construa uma visão chamada “vCapacidadesMedicas” com os campos especialidade, e sua quantidade 
CREATE VIEW vCapacidadesMedicas AS
SELECT Especialidade , count(*) AS Quantidade
FROM medicos 
GROUP by Especialidade

SELECT * FROM vCapacidadesMedicas

-- 4 Construa uma visão chamada “vconsultasago25” com nome do medico, nome do paciente, data e hora das consultas dos mês de agosto de 2025
CREATE VIEW vConsultasago25 AS

SELECT m.nome as Medico, p.nome as Paciente, c.data, c.hora
FROM Medicos m join Consultas c on m.codm=c.codm
		       join Pacientes p on p.codp=c.codp
WHERE DATA Between '2025-08-01' and '2025-08-31';

SELECT * FROM vConsultasago25
ORDER BY paciente


-- 5 Construa uma visão chamada “vconsultasRiscoDez25” com a quantidade de consultas para cada doença do grupo de risco “Ansiedade”, “Osteoporose” ou “Gripe” em 2025
CREATE VIEW vconsultasRiscoDez25 AS

SELECT doença, count(*) as quantidadesConsultas
FROM consultas c join Pacientes p on c.codp=p.codp
WHERE p.doença in ('Ansiedade','Osteoorose','Gripe') and
 c.data Between '2025-01-01' and '2025-12-31'
 GROUP BY doença

 SELECT * FROM vconsultasRiscoDez25


--6 Crie uma VIEW chamada vw_salario_medio_por_departamento que mostre o nome do departamento e o salário médio dos funcionários nesse departamento.
 CREATE VIEW vw_salario_medio_departamento as
 SELECT departamento, avg(salario) as MediaSalarial
 FROM funcionarios
 GROUP BY departamento

 SELECT * FROM vw_salario_medio_departamento
 ORDER BY MediaSalarial