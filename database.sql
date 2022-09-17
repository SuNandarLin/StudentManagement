select teacher_No from teacher 
where user_No=2;

insert into teacher values(null,2,null,null);
insert into teacher values(null,3,null,null);
insert into teacher values(null,4,null,null);

insert into user values(1,'Ma Ma','mama!','S');
insert into user values(2,'Daw Swe','swe','T');
insert into user values(3,'Rose','rose','T');
insert into user values(4,'Daw Nyein','nyein','T');
insert into user values(5,'Tin Tin Sein','tin','S');
insert into user values(6,'Mg Kyaw','kyaw','S');
insert into user values(7,'San San','san','S');
insert into user values(8,'Soe Soe','soe','S');
insert into user values(9,'Moe Moe','moe','S');
insert into user values(10,'Sweet','sweet','S');

insert into Student values(null,1,'4CEIT-2','KMD','092345','1998-09-09','U Kyaw Kyaw',3);1
insert into Student values(null,5,'4CEIT-7','Hlaing','0933345','1998-03-03','U Mya',3);2
insert into Student values(null,6,'2CEIT-7','Hlaing','0938345','2000-12-12','U Myo',5);6
insert into Student values(null,9,'2CEIT-9','Insein','0938345','2000-10-12','U Sein',5);3
insert into Student values(null,7,'3CEIT-12','South Oakala','09999','1999-11-09','U Aye',4);4
insert into Student values(null,8,'3CEIT-10','North Oakala','097983','1999-11-23','U Shwe',4);5
insert into Student values(null,10,'4CEIT-8','YTU','092283','1998-07-23','Michel',3);7

insert into rollNo values(1,4,'4CEIT-2');
insert into rollNo values(2,4,'4CEIT-7');
insert into rollNo values(3,2,'2CEIT-9');
insert into rollNo values(4,3,'3CEIT-12');
insert into rollNo values(5,3,'3CEIT-10');
insert into rollNo values(6,2,'2CEIT-7');
insert into rollNo values(7,4,'4CEIT-8');

insert into Tutorial values(1,'11023',10,null,null,null,null);
insert into Tutorial values(1,'11024',10,null,null,null,null);
insert into Tutorial values(2,'11023',8,null,null,null,null);
insert into Tutorial values(2,'11024',9,null,null,null,null);
insert into Tutorial values(3,'11025',2,null,null,null,null);
insert into Tutorial values(3,'13026',9,null,null,null,null);
insert into Tutorial values(4,'11025',6,null,null,null,null);
insert into Tutorial values(4,'13026',7,null,null,null,null);
insert into Tutorial values(5,'13027',4,null,null,null,null);
insert into Tutorial values(5,'13026',5,null,null,null,null);
insert into Tutorial values(5,'13027',3,null,null,null,null);
insert into Tutorial values(5,'13026',10,null,null,null,null);

insert into semester values("First year First semester",6);
insert into semester values("First year Second semester",6);
insert into semester values("Second year First semester",8);
insert into semester values("Second year Second semester",8);
insert into semester values("Third year First semester",7);
insert into semester values("Third year Second semester",7);
insert into semester values("Fourth year First semester",7);
insert into semester values("Fourth year Second semester",7);
insert into semester values("Fifth year First semester",6);
insert into semester values("Fifth year Second semester",6);
insert into semester values("Final year First semester",3);
insert into semester values("Final year Second semester",3);

insert into studentmark values(1,'11023','Fourth year Second semester',10,10,7,70
,'Pass',null,null,97)
insert into studentmark values(1,'11024','Fourth year Second semester',10,5,9,60
,'Pass',null,null,84)
insert into studentmark values(2,'11023','Fourth year Second semester',10,10,5,70
,'Pass',null,null,95)
insert into studentmark values(2,'11024','Fourth year Second semester',5,5,5,80
,'Pass',null,null,95)
insert into studentmark values(2,'11024','Fourth year Second semester',5,5,5,80
,'Pass',null,null,95)
insert into studentmark values(2,'11024','Fourth year Second semester',5,5,5,80
,'Pass',null,,null,95)
insert into studentMark values (3,'11025','Second year Second semester',
 null,null,null,null,null,null,null,null)
 insert into studentMark values (6,'11025','Second year Second semester',
 null,null,null,null,null,null,null,null)


select * from rollNo;
select * from course;
select * from teacher;
select * from student;
select * from user;
select * from tutorial;
select * from semester;
select * from studentmark;
desc semester;

select sm.student_No 
from studentMark sm,course c 
where c.course_No=sm.course_No and 
c.course_No='11023'

select u.user_Name 
from User u, student s 
where u.user_No=s.user_No and 
s.student_No=2;

select s.student_No , u.user_Name ,sm.tuto_Mark 
,sm.assign_Mark,sm.lab_Mark,sm.exam_Mark, sm.total_Mark ,result 
from studentMark sm,course c ,User u ,student s 
where c.course_No=sm.course_No and 
sm.student_No=s.student_No and 
u.user_No=s.user_No and
c.course_Name='Networking'

select sm.total_Mark,sm.assign_Mark,sm.lab_Mark,sm.exam_Mark, sm.total_Mark ,sm.result 
from studentMark sm,course c  
where c.course_No=sm.course_No and 
c.course_Name='Networking'

select s.roll_No 
from studentMark sm,course c ,User u ,student s 
where c.course_No=sm.course_No and 
sm.student_No=s.student_No and 
u.user_No=s.user_No and
c.course_Name='Networking'

update course set sem_Name='Fourth year Second semester'
where course_No='11023' or course_No='11024'

select sem_Name  from course  
where course_Name='Security'

desc studentMark;
desc student;

 select * from studentMark where student_No=1;
 select course_Name from course where course_No='11023';
 select user_No from user where user_Name='Rose';
 select teacher_No from teacher where user_No=3;
 select course_Name from course where teacher_No=2;
  select * from course where course_Name='Programming IV';
