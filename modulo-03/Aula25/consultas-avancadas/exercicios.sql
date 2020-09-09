--1) Faça uma consulta que mostre os anos de admissão e seus respectivos montantes de salários.
SELECT YEAR(data_admissao) as 'Ano de Admissão', SUM(salario) AS 'Montante'
FROM usuarios 
GROUP BY data_admissao;

--2) Faça uma consulta que recupere os meses que possuem mais de 2 usuários admitidos. Mostre os meses e suas respectivas quantidades de usuários.
SELECT COUNT(*) AS 'Quantidade', MONTH(data_admissao) as 'Mês de Admissão'
FROM usuarios 
GROUP BY data_admissao
HAVING COUNT(*) > 2;

--3) Faça uma consulta que recupere a média salarial dos usuários que começam com a letra "F".
SELECT TRUNCATE(AVG(salario), 2) AS 'Média' 
FROM usuarios
WHERE nome like 'F%';

--4) Faça uma consulta que mostre todos os usuários com seus respectivos salários que são maiores que a média salarial. 
SELECT nome AS 'Usuário', salario AS 'Salário'
FROM usuarios  
WHERE salario > (SELECT AVG(salario) FROM usuarios);

--5) Faça uma consulta que recupere o mês que possui a maior soma de salários. Mostre o mês e seu respectivo salário acumulado.
SELECT MONTH(data_admissao) AS 'MÊS', SUM(salario) AS 'SOMA' 
FROM usuarios
GROUP BY data_admissao
ORDER BY SOMA DESC
LIMIT 1;
