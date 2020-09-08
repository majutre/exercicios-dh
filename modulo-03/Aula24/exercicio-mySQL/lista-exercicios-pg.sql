-- 1.	Visualizar os databases existentes:
SHOW DATABASES;

-- 2.	Criar um database chamado "sistema":
CREATE DATABASE sistema;

-- 3.	Visualizar novamente os databases existentes e definir como padrão o database "sistema":
SHOW DATABASES;
USE sistema;

-- 4.	Definir o mecanismo padrão como InnoDB (transacional). Este comando funciona somente no MySQL.
SET default_storage_engine= InnoDB;

-- 5.	Definir o mecanismo padrão para aceitar acentuação na inclusão de dados. Isso deve ser feito antes da entrada de dados. Os dados que já foram armazenados não mostrará acentuação.
SET NAMES utf8mb4;

-- 6.	Criar a tabela "departamento", conforme especificado no diagrama:
CREATE TABLE departamento ( 
    id_departamento INT NOT NULL , 
    nome VARCHAR(100) NOT NULL , 
    telefone CHAR(15) NOT NULL , 
    PRIMARY KEY (id_departamento)
    ) 
    
ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_general_ci;

-- 7.	Visualizar a estrutura da tabela "departamento":
SHOW COLUMNS FROM departamento;

-- 8.	Criar a tabela "funcionario", conforme especificado no diagrama (observe a chave estrangeira - Foreign Key):
CREATE TABLE funcionario ( 
    id_funcionario INT NOT NULL , 
    nome VARCHAR(100) NOT NULL ,
    data_cadastro DATE NOT NULL ,
    id_departamento INT NOT NULL ,

    PRIMARY KEY (id_funcionario),
    FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento)
    ) 
    
ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_general_ci;

-- 10.	Criar a tabela "funcionario", conforme especificado no diagrama (sem a chave estrangeira - Foreign Key):
CREATE TABLE funcionario (
    id_funcionario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    id_departamento INT NOT NULL,
    data_cadastro DATE NOT NULL,

    PRIMARY KEY (id_funcionario)
);

-- 11.	Alterar a tabela criada anteriormente para adicionar a chave estrangeira (para quando se esquece da chave estrangeira).
ALTER TABLE funcionario
ADD FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento);

INSERT INTO `departamento`(`id_departamento`, `nome`, `telefone`) VALUES (1, 'compras', '555');

INSERT INTO departamento VALUES (3, 'marketing', '888');

INSERT INTO departamento (id_departamento, nome, telefone) VALUES (4, 'juridico', '111');
INSERT INTO departamento (id_departamento, nome, telefone) VALUES (5, 'TI', '333');
INSERT INTO departamento (id_departamento, nome, telefone) VALUES (6, 'logistica', '777');
INSERT INTO departamento (id_departamento, nome, telefone) VALUES (7, 'vendas', '888');
INSERT INTO departamento (id_departamento, nome, telefone) VALUES (8, 'RH', '1234');

SELECT * FROM departamento ORDER BY nome ASC ;

SELECT * FROM departamento ORDER BY nome DESC ;

SELECT * FROM departamento WHERE telefone like '';

SELECT * FROM departamento WHERE telefone <> '';

SELECT * FROM departamento WHERE id_departamento = 300;

SELECT * FROM departamento WHERE nome LIKE 'd%';

SELECT * FROM departamento WHERE nome LIKE '%vendas';

SELECT * FROM departamento WHERE nome LIKE '%de%';

SELECT * FROM departamento WHERE nome NOT LIKE '%de%';

SELECT telefone FROM departamento WHERE id_departamento = 3;

DELETE FROM departamento WHERE id_departamento = 4;

-- 27.	Digite o comando para fechar/desconectar do MySQL.
exit;

-- 28.	Digite o comando para verificar a versão e data atual.
SELECT VERSION(), CURRENT_DATE;

-- 29.	Digite o comando para verificar o usuário.
SELECT USER();

-- 30.	Digite o comando para cancelar outro comando que está no meio do processo de entrada no prompt.
;