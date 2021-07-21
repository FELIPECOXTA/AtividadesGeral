create database db_ecomerce;

use db_ecomerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255),
preco decimal,
quantidade int,
descricao varchar(255),
codigobarras int,
primary key(id)
);

insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ("jaqueta", 2900.00, 3, "couro", 3012);
insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ("camisa", 589.00, 23, "linho", 5363);
insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ("camiseta", 229.00, 50, "pimacotton", 1012);
insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ("calca", 559.00, 12, "stretch", 6372);
insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ("cueca", 199.00, 10, "algodao", 6352);
insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ("corta vento", 769.00, 53, "nilon", 2730);
insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ("tenis", 790.00, 57, "king rubber", 9383);
insert into tb_produtos(nome, preco, quantidade, descricao, codigobarras) values ( "sapato", 1200.00, 7, "couro caprino", 3243);

select * from tb_produtos; 

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set preco = 999.00 where id = 8;