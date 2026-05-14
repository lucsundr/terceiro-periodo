--1
CREATE VIEW vw_pacientes_feminino_consultas AS
SELECT 
    p.nome AS nome_paciente,
    c.data,
    m.nome AS nome_medico
FROM Pacientes p
JOIN Consultas c ON p.codp = c.codp
JOIN Medicos m ON c.codm = m.codm
WHERE p.sexo = 'F';

SELECT * FROM vw_pacientes_feminino_consultas;

--2
CREATE VIEW vw_salarios_por_departamento AS
SELECT 
    departamento,
    AVG(salario) AS salario_medio,
    SUM(salario) AS salario_total
FROM Funcionarios
GROUP BY departamento;

SELECT * FROM vw_salarios_por_departamento;

--3
CREATE PROCEDURE sp_registrar_e_pagar_consulta
    @codm INT,
    @codp INT
AS
BEGIN
    DECLARE @idConsulta INT;

    INSERT INTO Consultas (codm, codp, data, hora)
    VALUES (@codm, @codp, CAST(GETDATE() AS DATE), CAST(GETDATE() AS TIME));

    SET @idConsulta = SCOPE_IDENTITY();

    EXEC sp_registrar_pagamento @idConsulta;
END;

--4
CREATE PROCEDURE sp_listar_funcionarios_por_cidade
    @cidade VARCHAR(20)
AS
BEGIN
    SELECT 
        nome,
        departamento
    FROM Funcionarios
    WHERE cidade = @cidade;
END;