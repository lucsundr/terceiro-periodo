-- 1 Crie uma procedure que escreva “bem-vindo a UC banco de dados II”
CREATE PROCEDURE sp_bemvindo
AS
select 'bem-vindo a UC banco de dados II'


exec sp_bemvindo


-- 2 Crie uma procedure sp_listamedicorj que liste os médicos que moram no RJ
go


CREATE PROCEDURE sp_listamedicorj
AS
select nome, especialidade FROM Medicos
WHERE cidade = 'Rio de Janeiro'

exec sp_listamedicorj

-- 3. Crie uma procedure sp_listapaciente que, dado um CPF, liste as informações de um paciente
go

CREATE PROCEDURE sp_listapaciente(@CPF char(11))
as
select * from Pacientes

WHERE cpf = @CPF

exec sp_listapaciente '00334455667'

select cpf from Pacientes

-- 4 Crie uma procedure chamada sp_consultasporpaciente que receba como parâmetro o CPF de um paciente e retorne a data da consulta e o nome do médico que o atendeu.
go
CREATE PROCEDURE sp_consultasporpaciente (@cpf varchar(14))
AS
select data from Consultas
