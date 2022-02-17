create database org;

show databases;

use org;

create table worker(
worker_id int not null primary key auto_increment,
first_name char(25),
last_name char(25),
salary int(15),
joining_date datetime,
department char(25)
); 

desc worker;

insert into worker (worker_id,first_name,last_name,salary,joining_date,department)
values(001, 'Monika', 'Arora', 100000, '14-02-20 09.00.00', 'HR'),
		(002, 'Niharika', 'Verma', 80000, '14-06-11 09.00.00', 'Admin'),
		(003, 'Vishal', 'Singhal', 300000, '14-02-20 09.00.00', 'HR'),
		(004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin');
        
        
        select * from worker;
        


create table bonus(worker_ref_id int primary key not null,
bonus_date datetime,
bonus_amount int
);

desc bonus;

insert into bonus values(1,'2016-02-20',5000);
insert into bonus values(2,'2016-06-20',3000);
insert into bonus values(3,'2016-02-20',4000);
insert into bonus values(4,'2016-02-20',4500);
insert into bonus values(5,'2016-06-11',3500);

select * from bonus;



create table title(worker_ref_id int primary key not null,
worker_title varchar(20) not null,
affected_from datetime
);

desc title;

insert into title values(1,'manager','2016-02-20');
insert into title values(2,'executive','2016-06-11');
insert into title values(3,'executive','2016-02-20');
insert into title values(4,'manager','2016-02-20');
insert into title values(5,'Asst. manager','2016-02-20');
insert into title values(6,'executive','2016-02-20');
insert into title values(7,'lead','2016-02-20');
insert into title values(8,'lead','2016-06-11');

select * from title;