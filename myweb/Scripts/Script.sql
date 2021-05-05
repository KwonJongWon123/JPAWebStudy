create table user(
id Integer auto_increment primary key,
firstname varchar(40),
lastname varchar(40)
);

CREATE TABLE CAR(
	id bigint auto_increment,
	model_name varchar(255) NOT NULL,
	company_id bigint NOT NULL,
	passenger_capacity int,
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL,
	
	PRIMARY key(id)
);

insert into user(firstname, lastname) values ('devn8','user8');