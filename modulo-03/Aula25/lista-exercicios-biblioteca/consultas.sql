/********************
    CONSULTAS
 ********************/
-- Mostrando todos os livros que possuem categoria
-- Cláusula ON
SELECT
  l.id_livro,
  l.titulo,
  c.id_categoria,
  c.categoria
FROM livro l
  INNER JOIN categoria c
    ON l.id_categoria = c.id_categoria;
 
-- Mostrando todos os livros que possuem categoria
-- Cláusula USING
 
-- A cláusula USING pode ser usada quando a chave primária é 
--  igual a chave estrangeira
SELECT
  l.id_livro,
  l.titulo,
  c.id_categoria,
  c.categoria
FROM livro l
  INNER JOIN categoria c
    USING (id_categoria);
 
 
-- Mostrando os livros que possuem e que não possuem categoria
SELECT
  l.id_livro,
  l.titulo,
  c.id_categoria,
  c.categoria
FROM livro l
  LEFT OUTER JOIN categoria c
    USING (id_categoria);
 
-- Mostrando todas as categorias que possuem e que não possuem livros. 
SELECT
  l.id_livro,
  l.titulo,
  c.id_categoria,
  c.categoria
FROM livro l
  RIGHT OUTER JOIN categoria c
    USING (id_categoria);
 
-- Mostrando todos os alunos que fizeram empréstimos
SELECT
  a.id_aluno,
  a.nome,
  e.data_emprestimo,
  e.data_devolucao
FROM aluno a
  INNER JOIN emprestimo e
    ON a.id_aluno = e.id_aluno;
 
-- Mostrando todos os alunos que fizeram e que não fizeram empréstimos.
SELECT
  a.id_aluno,
  a.nome,
  e.data_emprestimo,
  e.data_devolucao
FROM aluno a
  LEFT OUTER JOIN emprestimo e
    ON a.id_aluno = e.id_aluno;
 
-- Mostrando todos os empréstimos que possuem e que não possuem alunos
SELECT
  a.id_aluno,
  a.nome,
  e.data_emprestimo,
  e.data_devolucao
FROM aluno a
  RIGHT OUTER JOIN emprestimo e
    ON a.id_aluno = e.id_aluno;

Reservado para um gráfico.

-- Mostrando todos os livros que os alunos pegaram emprestados
 
SELECT
  a.id_aluno,
  a.nome,
  l.id_livro,
  l.titulo,  
  e.data_emprestimo,
  e.data_devolucao
FROM aluno a
  INNER JOIN emprestimo e
    ON a.id_aluno = e.id_aluno
  INNER JOIN livro l
    ON e.id_livro = l.id_livro;
 
-- Mostrando todos os livros que os alunos pegaram emprestados. 
-- Mostrar também as categorias de cada livro.
 
SELECT
  a.id_aluno,
  a.nome,
  l.id_livro,
  l.titulo,  
  c.id_categoria,
  c.categoria,
  e.data_emprestimo,
  e.data_devolucao
FROM aluno a
  INNER JOIN emprestimo e
    ON a.id_aluno = e.id_aluno
  INNER JOIN livro l
    ON e.id_livro = l.id_livro
  INNER JOIN categoria c
    ON l.id_categoria = c.id_categoria;
 
-- Mostrando todos os livros que os alunos pegaram emprestados. 
-- Mostrar também as categorias de cada livro.
-- Se o aluno não pegou um livro, mostrar também.
 
SELECT
  a.id_aluno,
  a.nome,
  l.id_livro,
  l.titulo,  
  c.id_categoria,
  c.categoria,
  e.data_emprestimo,
  e.data_devolucao
FROM aluno a
  LEFT JOIN emprestimo e
    ON a.id_aluno = e.id_aluno
  LEFT JOIN livro l
    ON e.id_livro = l.id_livro
  LEFT JOIN categoria c
    ON l.id_categoria = c.id_categoria;

