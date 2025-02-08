# JPQL
JPQL stands for Java Persistence Query Language. Spring Data provides multiple ways to create and execute a query, and JPQL is one of these. It defines queries using the @Query annotation in Spring to execute both JPQL and native SQL queries. The query definition uses JPQL by default.
We use the @Query annotation to define a SQL query in Spring.


## Demonstration of Component Mapping through Code
For this I have created one Customer Entity.

One Customer Repository having JPQL query update method.

Written Test Case for all update method.

Use MySql Database for storing customer table.

### Commands Used in MySQL Workbench -

use sys;

CREATE TABLE customer ( id int PRIMARY KEY auto_increment, name varchar(20), city varchar(20), state varchar(20), country varchar(20), zipcode varchar(20) );

select * from customer;
