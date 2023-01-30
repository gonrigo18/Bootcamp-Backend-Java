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
payment_description varchar (100) not null,
short_description varchar (15) not null,
payment_code varchar (5) not null,
enabled int not null
);

create table countries (
id int primary key auto_increment unique not null,
countrie_description varchar (50) not null,
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

# Constrain de tabla ordenes
alter table orders add constraint fk_orders_orders_states foreign key (orders_states_id) references orders_states(id);
alter table orders add constraint fk_orders_partners foreign key (partners_id) references partners(id);
alter table orders add constraint fk_orders_coupons foreign key (coupons_id) references coupons(id);


alter table orders_articles add constraint fk_orders_articles_orders foreign key (orders_id) references orders(id);
alter table orders_articles add constraint fk_orders_articles_articles foreign key (articles_id) references articles(id); 

alter table payments_orders add constraint fk_payments_orders_orders foreign key (orders_id) references orders(id);
alter table payments_orders add constraint fk_payments_orders_payments_methods foreign key (payment_methods_id) references payment_methods(id);

alter table orders_addresses add constraint fk_orders_addresses_orders foreign key (orders_id) references orders(id);
alter table orders_addresses add constraint fk_orders_addresses_countries foreign key (countries_id) references countries(id);













