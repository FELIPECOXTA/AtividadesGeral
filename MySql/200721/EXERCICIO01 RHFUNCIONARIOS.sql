create database db_rh;

use db_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255),
idade int,
sexo varchar(255),
profissao varchar(255),
salario decimal(8,2),
primary key(id)
);

insert into tb_funcionarios(nome, idade, sexo, profissao, salario) values ("Felipe", 25, "Masc", "Consultor", 1800.00);
insert into tb_funcionarios(nome, idade, sexo, profissao, salario) values ("Luana", 24, "Fem", "Gerente", 5142.00);
insert into tb_funcionarios(nome, idade, sexo, profissao, salario) values ("Samantha", 26, "Fem", "Consultora",1517.00);
insert into tb_funcionarios(nome, idade, sexo, profissao, salario) values ("Victor", 28, "Masc", "Consultor", 1700.00);
insert into tb_funcionarios(nome, idade, sexo, profissao, salario) values ("Joao", 30, "Masc","Consultor", 2200.00);

select * from tb_funcionarios;

select * from tb_funcionarios where salario > 2000.00;

select * from tb_funcionarios where salario < 2000.00;

update tb_funcionarios set salario =  2100.00 where id = 4;








