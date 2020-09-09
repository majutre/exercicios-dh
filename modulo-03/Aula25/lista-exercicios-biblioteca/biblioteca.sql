--1)	Criar o database “biblioteca”.
CREATE DATABASE biblioteca;

--2)	Visualizar os databases existentes e definir como padrão o database "biblioteca":
SHOW DATABASES;
USE biblioteca;

--5)	Criar a tabela "categoria", conforme especificado no diagrama:
CREATE TABLE categoria (
    id_categoria INTEGER NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_categoria)
)
ENGINE=INNODB DEFAULT charset=utf8;

--6)	Visualizar a estrutura da tabela "categoria": 
DESCRIBE categoria;

--7) Criar a tabela "livro", conforme especificado no diagrama: 
CREATE TABLE livro (
    id_livro INTEGER NOT NULL,
    titulo VARCHAR(200) NOT NULL,
    id_categoria INTEGER NOT NULL,
    PRIMARY KEY (id_livro),

    CONSTRAINT categoria_livro_fk 
      FOREIGN KEY (id_categoria)
      REFERENCES categoria (id_categoria)
)
ENGINE=INNODB DEFAULT charset=utf8;

--8)	Visualizar a estrutura da tabela "livro": 
DESCRIBE livro;

--9)	 Criar a tabela "aluno", conforme especificado no diagrama:
CREATE TABLE aluno (
    id_aluno INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_aluno)
)
ENGINE=InnoDB DEFAULT charset=utf8;

--10)	Visualizar a estrutura da tabela "aluno":
DESCRIBE aluno;

--11)	 Criar a tabela "emprestimo", conforme especificado no diagrama:
CREATE TABLE emprestimo (
    id_emprestimo INTEGER AUTO_INCREMENT NOT NULL,
    id_aluno INTEGER NOT NULL,
    id_livro INTEGER NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE,
    PRIMARY KEY (id_emprestimo),
    
    CONSTRAINT emprestimo_uk 
      UNIQUE KEY( id_aluno, id_livro, data_emprestimo ),
    CONSTRAINT livro_emprestimo_fk
      FOREIGN KEY (id_livro)
      REFERENCES livro (id_livro),
    CONSTRAINT aluno_emprestimo_fk
      FOREIGN KEY (id_aluno)
      REFERENCES aluno (id_aluno)
)
ENGINE=InnoDB DEFAULT charset=utf8;
 
--12)	Visualizar a estrutura da tabela "emprestimo":
DESCRIBE emprestimo;

