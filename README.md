# java8-mvn-mysql
java8-mvn-mysql


# PAra codeenvy

mysql --host=db --user=petclinic --password=password
mysql --host=db --user=root --password=password


# instalar para conectarse a base datos
sudo apt-get install mysql-server


show databases;

create database test;
use test;
create table user(id int NOT NULL PRIMARY KEY AUTO_INCREMENT, name varchar(20), team_name varchar(20), salary int);

describe user;


https://www.digitalocean.com/community/tutorials/a-basic-mysql-tutorial
https://dev.mysql.com/doc/refman/5.7/en/connecting.html
