create table usuarios (
    id_usuario integer not null,
    nome varchar(50) not null,
    data_admissao date not null,
    salario decimal(10,2) not null,
    primary key(id_usuario)
)
ENGINE = InnoDB charset = utf8;

 
insert into usuarios values(1, 'Emílio Fenandes', '2010-09-01','3500.00');
insert into usuarios values(2, 'Francisco Gomes', '2009-07-11','4800.00');
insert into usuarios values(3, 'Daniel Estrada',  '2010-09-01','3500.00');
insert into usuarios values(4, 'Célio Drummond',  '2009-07-11','6145.00');
insert into usuarios values(5, 'Abelardo Barbosa','2010-09-01','2100.00');
insert into usuarios values(6, 'Bernardo Costa',  '2011-05-05','5575.00');

--AVG
SELECT AVG(salario) AS 'Média Salarial' FROM usuarios;

SELECT TRUNCATE(AVG(salario), 2) AS 'Média Salarial' FROM usuarios;

--COUNT
SELECT COUNT(nome) FROM usuarios;

SELECT COUNT(*) AS 'Quantidade' FROM usuarios;

--MAX
SELECT MAX(salario) AS 'Maior Salário' FROM usuarios;

SELECT nome as 'Nome', MAX(salario) AS 'Salário'
FROM usuarios
WHERE salario = (SELECT MAX(salario) FROM usuarios);

--MIN
SELECT MIN(salario) AS 'Menor Salário' FROM usuarios;

SELECT nome as 'Nome', MIN(salario) AS 'Salário'
FROM usuarios
WHERE salario = (SELECT MIN(salario) FROM usuarios);

--SUM
SELECT SUM(salario) AS 'Total' FROM usuarios;

--GROUP BY
SELECT data_admissao, SUM(salario) AS 'Total'
FROM usuarios 
GROUP BY data_admissao;

--HAVING
SELECT data_admissao, SUM(salario) AS 'Total'
FROM usuarios 
GROUP BY data_admissao
HAVING SUM(salario) > 10000;

SELECT data_admissao, SUM(salario) AS 'Total'
FROM usuarios 
WHERE nome like 'F%'
GROUP BY data_admissao
HAVING SUM(salario) > 100;


