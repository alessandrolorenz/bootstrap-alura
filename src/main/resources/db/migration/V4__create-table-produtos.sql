create table produtos(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    categoria varchar(100) not null,
    preco varchar(100) not null,
    estoque varchar(100) not null,

    primary key(id)

);