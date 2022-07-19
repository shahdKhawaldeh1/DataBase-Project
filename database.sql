create database driving;
use driving;
create table student (
student_id int primary key NOT NULL,
last_name varchar(30) NOT NULL,
first_name varchar(30) NOT NULL,
gender char(10),
phone varchar(15),
date_of_birth date,
address varchar(200),
username varchar(30) NOT NULL,
password1 varchar(32) NOT NULL ); 

INSERT INTO STUDENT VALUES (90884367,'altawil','Ahmad','male', 0569987654,'2000-7-7','nubles','ahmadaltawil','12345'),
						(994327687,'ali ','sara','femle', 0568443108,'2001-9-8','ramallah','sara-ali','9987654321'),
                        (998888882,'omar ','lana','femle', 0598453109,'1987-9-5','albireh','lana-11','lana123'),
                        (990909090,'yazen ','Ahmad','male', 0566681118,'2001-11-8','albireh','ahmad_yazen','123ahmad'),
                        (990000001,'alsmadi ','sanad','male', 0593333108,'2001-2-13','Jenin','sanad_11','77665544'),
						   (997888889,'altawil ','maryam','femle', 0568443108,'2001-9-8','Jenin','maryam1114','12345maryam');
                           
create table instructor (
instructor_id int primary key NOT NULL,
last_name varchar(30) NOT NULL,
first_name varchar(30) NOT NULL,
gender char(10),
phone varchar(15),
date_of_birth date,
address varchar(200),
username varchar(30) NOT NULL,
password1 varchar(32) NOT NULL ); 

INSERT INTO instructor VALUES (1500, 'SALAMEH', 'ALI', 'MALE', '0567467549', '1999-03-10', 'NABLUS', 'SALAMEH', 'Ssalameh100');

create table car (
car_id int primary key NOT NULL,
model varchar(30) NOT NULL,
color varchar(32),
year_of_manufacture int
); 
select * from car;
INSERT INTO CAR VALUES (9604011,'kia','gray',2019),
                           (9604001,'Hundai','gray',2019),
                           (1234542,'Hundai','red',2020),
                           (9614011,'kia','black',2011),
						   (4003943,'skoda','blue',2017);

create table payment (
p_id int primary key NOT NULL AUTO_INCREMENT,
amount float NOT NULL,
p_date date,
s_id int not null,
foreign key (s_id) references student(student_id)

);
INSERT INTO payment VALUES (1,90,'2022-6-9',90884367),
(2,200,'2022-10-11',994327687),
(3,90,'2021-7-9',998888882),
(4,180,'2022-8-23',990909090),
(5,90,'2022-6-9',990000001),
(6,90,'2022-10-5',997888889),
(7,200,'2022-10-11',994327687),
(8,120,'2022-10-19',997888889);

show tables ;
create  table enroll( 
e_id int primary key not null AUTO_INCREMENT,
e_time time(6),
e_date date,
e_day varchar(10),
inst_id int not null,
car_id int not null ,
stu_id int not null,
foreign key (inst_id) references instructor(instructor_id),
foreign key (car_id) references car (car_id),
foreign key (stu_id) references student (student_id)
);
INSERT INTO enroll VALUES (1,'13:30','2022-6-9','wensday',901111222,9604011,90884367)
;
select * from enroll;
create table report (
r_id int primary key not null AUTO_INCREMENT,
remark varchar(128),
score varchar (32),
tranning_name varchar (32),
inst_id int,
stu_id int,
foreign key (inst_id) references instructor(instructor_id),
foreign key (stu_id) references student (student_id)
);

INSERT INTO report VALUES (1, null ,'2022-6-9','Wednesday', 901111222,9604011, 90884367)
;