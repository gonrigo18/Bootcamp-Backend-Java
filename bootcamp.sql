create database bootcamp;
use bootcamp;

create table brands (
id int primary key auto_increment unique not null,
title varchar (50) not null,
sku varchar (50) not null
);

create table categories (
id int primary key auto_increment unique not null,
title varchar (50) not null,
enabled int not null
);

create table articles (
id int primary key auto_increment unique not null,
title varchar (50) not null,
creation_date date not null,
price float not null,
stock int,
brands_id varchar (50) not null,
categories_id int not null
);

create table partners (
id int primary key auto_increment unique not null,
name_ varchar (50) not null,
last_name varchar (50) not null,
email varchar (50) not null,
high_date date not null
);

create table orders_states (
id int primary key auto_increment unique not null,
title varchar (50) not null,
field varchar (50) not null
);

alter table orders_states drop column final;
alter table orders_states add column short_description varchar(50);
alter table orders_states add column final int not null;

create table orders_articles (
id int primary key auto_increment unique not null,
orders_id int not null,
article_number int not null,
quantity int not null,
articles_id int not null,
unit_price float not null
);


create table orders (
id int primary key auto_increment unique not null,
creation_date date not null,
partners_id int,
orders_states_id int,
total_amount float,
coupons_id int
);

create table payments_orders (
id int primary key auto_increment unique not null,
orders_id int not null,
payment_methods_id int not null,
payment_date date not null,
amount float not null
);

create table orders_addresses (
orders_id int,
countries_id int,
shipping_address varchar (100) not null
);

create table coupons (
id int primary key auto_increment unique not null,
name_ varchar (50) not null,
coupon_code varchar (10) not null,
valid_since date not null,
validity_until date,
discount_rate float);

create table payment_methods (
id int primary key auto_increment unique not null,
name_ varchar (50) not null,
enabled int not null
);

create table countries (
id int primary key auto_increment unique not null,
name_ varchar (50) not null,
short_description varchar (150) not null
);

create table newsletters (
id int primary key auto_increment unique not null,
email varchar (100) not null
);

alter table articles add constraint fk_articles_categories foreign key (categories_id) references categories(id);

select * from articles;
select * from brands;

alter table articles drop column brands_id;
alter table articles add column brands_id int;
alter table newsletters add column high_date date;

describe articles;

alter table articles add constraint fk_articles_brands foreign key (brands_id) references brands(id);
alter table articles add constraint fk_articles_brands foreign key(brands_id) references brands(id);







