CREATE PROCEDURE sp_teste
AS
select 'baci de dados rocks !!!'

exec sp_teste
go
--Exemplo 2: Procdure que lista o nome e especialidade dos mdicos
CREATE PROCEDURE sp_ListaMedicos
AS
	select nome, especialidade
	from medicos
go 
exec sp_ListaMedicos
go
--Exemplo 3 - Procedure que lista o nome e especialidade de um medico (codm)


-- drop PROCEDURE sp_ListaMedicoCodm -- apagar executar novamente
CREATE PROCEDURE sp_ListaMedicoCodm(
@codigo int
)
AS
	select nome, especialidade
	from Medicos
	where Codm=@codigo

exec sp_ListaMedicoCodm 44
go

 
--Exemplo 4 - Procedure que lista o nome, idade, especialidade, cidade dos medicos 
--dado a especialidade e a cidade


--drop PROCEDURE sp_ListaCardioRJ-- apagar executar novamente
CREATE PROCEDURE sp_ListaCardioRJ(
	@especialidademed char(30),
	@cidademedico char (20)
)
AS
	select nome, idade, especialidade, cidade
	from Medicos
	where especialidade=@cidademedico and
		cidade = @cidademedico

exec sp_ListaCardioRJ 'cardiologia', 'rio de janeiro' 
go

exec sp_helptext sp_ListaCardioRJ   --testar so esse--

CREATE PROCEDURE sp_ListaespecCidade(
	@especialidademed char(30),
	@cidademedico char (20)
)
	with encryption
AS
	select nome, idade, especialidade, cidade
	from Medicos
	where especialidade=@cidademedico and
		cidade = @cidademedico