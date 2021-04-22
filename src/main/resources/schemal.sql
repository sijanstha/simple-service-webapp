create database db_ecommerce;

use db_ecommerce;

create table tbl_products(
	id int auto_increment not null primary key,
	name varchar(255) not null,
	price double not null
);