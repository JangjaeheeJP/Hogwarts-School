select * from hogu;

create table hogu(
	id char(10) not null,
	pw varchar(10) not null,
	name varchar(15) not null,
	tel varchar(20),
	email varchar(50),
	magic varchar(50) not null
); 

drop table hogu; 