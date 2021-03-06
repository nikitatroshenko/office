drop database if exists employee;

create database employee character set utf8;

use employee;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;


CREATE TABLE `training` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=211 DEFAULT CHARSET=utf8;


CREATE TABLE `employee_training` (
  `employee_id` int(11) NOT NULL,
  `training_id` int(11) NOT NULL,
  UNIQUE KEY `employee_id` (`employee_id`,`training_id`),
  KEY `employee_training_fk1` (`training_id`),
  CONSTRAINT `employee_training_fk` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `employee_training_fk1` FOREIGN KEY (`training_id`) REFERENCES `training` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `employee` values(101,"Andrei", "Tishkovski","at@email.com");
insert into `employee` values(102,"Sergei", "Ivanov","si@email.com");
insert into `employee` values(103,"Vladimir", "Tichonov","vt@email.com");
insert into `employee` values(104,"Pavel", "Holod","ph@email.com");
insert into `employee` values(105,"Kiril", "Platov","kp@email.com");
insert into `employee` values(106,"Olga", "Ivanova","oi@email.com");
insert into `employee` values(107,"Natasha", "Petrova","np@email.com");
insert into `employee` values(108,"Smart", "Student","ss@email.com");
insert into `employee` values(109,"Guest", "Guest","gg@email.com");
insert into `employee` values(110,"Smart", "Student","ss@email.com");
insert into `employee` values(111,"Andrey", "Petrov","ap@email.com");
insert into `employee` values(112,"User1", "User1","uu@email.com");

commit;

insert into `training` values(201,"J2EE Technologies");
insert into `training` values(202,"J2SE Training");
insert into `training` values(203,"JPA");
insert into `training` values(204,"Win XP/7 Training");
insert into `training` values(205,"SQL Training");
insert into `training` values(206,"JDBC, Servlet and JSP");
insert into `training` values(207,"Database Administration");
insert into `training` values(208,"Test Training");
insert into `training` values(209,"English Course");
insert into `training` values(210,"SEO Training");

commit;
