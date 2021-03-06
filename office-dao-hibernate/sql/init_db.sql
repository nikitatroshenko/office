CREATE TABLE nc_be_employee (
  employee_id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(20) NOT NULL,
  last_name varchar(20) NOT NULL,
  email varchar(20) DEFAULT NULL,
  user_id int(11) not null,
  PRIMARY KEY (employee_id),
  constraint employee_user_fk foreign key (user_id) references nc_be_user (user_id) on delete no action on update no action,
  unique key (user_id)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;


CREATE TABLE nc_be_training (
  training_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  PRIMARY KEY (training_id)
) ENGINE=InnoDB AUTO_INCREMENT=211 DEFAULT CHARSET=utf8;


CREATE TABLE nc_be_employee_training (
  employee_id int(11) NOT NULL,
  training_id int(11) NOT NULL,
  UNIQUE KEY employee_id (employee_id,training_id),
  KEY employee_training_fk1 (training_id),
  CONSTRAINT employee_training_fk FOREIGN KEY (employee_id) REFERENCES nc_be_employee (employee_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT employee_training_fk1 FOREIGN KEY (training_id) REFERENCES nc_be_training (training_id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table nc_be_user (
    user_id int(11) not null auto_increment,
    type varchar(20) not null,
    primary key (user_id)
) engine=InnoDB auto_increment=313 default charset=utf8;

insert into nc_be_user values(301, 'employee');
insert into nc_be_user values(302, 'employee');
insert into nc_be_user values(303, 'employee');
insert into nc_be_user values(304, 'employee');
insert into nc_be_user values(305, 'employee');
insert into nc_be_user values(306, 'employee');
insert into nc_be_user values(307, 'employee');
insert into nc_be_user values(308, 'employee');
insert into nc_be_user values(309, 'employee');
insert into nc_be_user values(310, 'employee');
insert into nc_be_user values(311, 'employee');
insert into nc_be_user values(312, 'employee');

commit;

insert into nc_be_employee values(101,'Andrei', 'Tishkovski','at@email.com', 301);
insert into nc_be_employee values(102,'Sergei', 'Ivanov','si@email.com', 302);
insert into nc_be_employee values(103,'Vladimir', 'Tichonov','vt@email.com', 303);
insert into nc_be_employee values(104,'Pavel', 'Holod','ph@email.com', 304);
insert into nc_be_employee values(105,'Kiril', 'Platov','kp@email.com', 305);
insert into nc_be_employee values(106,'Olga', 'Ivanova','oi@email.com', 306);
insert into nc_be_employee values(107,'Natasha', 'Petrova','np@email.com', 307);
insert into nc_be_employee values(108,'Smart', 'Student','ss@email.com', 308);
insert into nc_be_employee values(109,'Guest', 'Guest','gg@email.com', 309);
insert into nc_be_employee values(110,'Smart', 'Student','ss@email.com', 310);
insert into nc_be_employee values(111,'Andrey', 'Petrov','ap@email.com', 311);
insert into nc_be_employee values(112,'User1', 'User1','uu@email.com', 312);

commit;

insert into nc_be_training values(201,'J2EE Technologies');
insert into nc_be_training values(202,'J2SE Training');
insert into nc_be_training values(203,'JPA');
insert into nc_be_training values(204,'Win XP/7 Training');
insert into nc_be_training values(205,'SQL Training');
insert into nc_be_training values(206,'JDBC, Servlet and JSP');
insert into nc_be_training values(207,'Database Administration');
insert into nc_be_training values(208,'Test Training');
insert into nc_be_training values(209,'English Course');
insert into nc_be_training values(210,'SEO Training');

commit;

insert into nc_be_employee_training (employee_id, training_id) values (101, 201);
insert into nc_be_employee_training (employee_id, training_id) values (101, 202);
insert into nc_be_employee_training (employee_id, training_id) values (102, 202);
insert into nc_be_employee_training (employee_id, training_id) values (102, 203);

commit;