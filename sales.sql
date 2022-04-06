sales=# select * from salesman;   
                                                                                       
salesman_id |    name     |   city    | commission                                                                     
-------------+-------------+-----------+------------                                                                            
5001 | Nikhil      | Bangalore |        0.2                                                                             
5002 | Pavan       | Mumbai    |        0.1                                                                             
5003 | Santhosh    | Chennai   |       0.15                                                                             
5004 | Mallikarjun | Mysore    |       0.05                                                                             
5005 | Fazal       | Hyderabad |       0.11                                                                             
5006 | Chandru     | Delhi     |       0.18                                                                     
(6 rows)                                                                                                                                                                                                                                                                                                                                                                
sales=# select * from customer;                                                                                          
customer_id | customer_name |     city      | grade | salesman_id                                                     
-------------+---------------+---------------+-------+-------------                                                             
1001 | Abhi          | Dharwad       |   100 |        5001                                                              
1002 | Nick          | New York      |   200 |        5001                                                             
1003 | TomCruise     | California    |   500 |        5001                                                              
1004 | Virat         | Bangalore     |   100 |        5002                                                             
1005 | Rakesh        | Hyderabad     |   150 |        5002                                                              
1006 | Anmol         | Noida         |   100 |        5006                                                              
1007 | Rakesh        | Vishakapatnam |   200 |        5005                                                              
1008 | Vijay         | Chennai       |   400 |        5004                                                              
1009 | Sharukh       | Mumbai        |   300 |        5003                                                      
(9 rows)           



Server [localhost]:
Database [postgres]:
Port [5432]:
Username [postgres]:
Password for user postgres:
psql (14.2)
WARNING: Console code page (437) differs from Windows code page (1252)
         8-bit characters might not work correctly. See psql reference
         page "Notes for Windows users" for details.
Type "help" for help.

postgres=# \l
                                         List of databases
   Name    |  Owner   | Encoding |      Collate       |       Ctype        |   Access privileges
-----------+----------+----------+--------------------+--------------------+-----------------------
 demo      | postgres | UTF8     | English_India.1252 | English_India.1252 |
 postgres  | postgres | UTF8     | English_India.1252 | English_India.1252 |
 sales     | postgres | UTF8     | English_India.1252 | English_India.1252 |
 template0 | postgres | UTF8     | English_India.1252 | English_India.1252 | =c/postgres          +
           |          |          |                    |                    | postgres=CTc/postgres
 template1 | postgres | UTF8     | English_India.1252 | English_India.1252 | =c/postgres          +
           |          |          |                    |                    | postgres=CTc/postgres
(5 rows)


postgres=# \c sales;
You are now connected to database "sales" as user "postgres".


sales=# \d orders;
                          Table "public.orders"
     Column      |         Type          | Collation | Nullable | Default
-----------------+-----------------------+-----------+----------+---------
 order_id        | bigint                |           | not null |
 purchase_amount | double precision      |           | not null |
 date            | character varying(50) |           | not null |
 customer_id     | bigint                |           | not null |
 salesman_id     | bigint                |           | not null |
Indexes:
    "orders_pkey" PRIMARY KEY, btree (order_id)
Foreign-key constraints:
    "orders_customer_id_fkey" FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
    "orders_salesman_id_fkey" FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)


sales=# \d customers;
Did not find any relation named "customers".
sales=# \d customer;
                         Table "public.customer"
    Column     |          Type          | Collation | Nullable | Default
---------------+------------------------+-----------+----------+---------
 customer_id   | bigint                 |           | not null |
 customer_name | character varying(50)  |           | not null |
 city          | character varying(100) |           | not null |
 grade         | bigint                 |           |          |
 salesman_id   | bigint                 |           |          |
Indexes:
    "customer_pkey" PRIMARY KEY, btree (customer_id)
Foreign-key constraints:
    "customer_salesman_id_fkey" FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
Referenced by:
    TABLE "orders" CONSTRAINT "orders_customer_id_fkey" FOREIGN KEY (customer_id) REFERENCES customer(customer_id)


sales=# \d salesman;
                       Table "public.salesman"
   Column    |         Type          | Collation | Nullable | Default
-------------+-----------------------+-----------+----------+---------
 salesman_id | bigint                |           | not null |
 name        | character varying(50) |           | not null |
 city        | character varying(50) |           |          |
 commission  | double precision      |           |          |
Indexes:
    "salesman_pkey" PRIMARY KEY, btree (salesman_id)
Referenced by:
    TABLE "customer" CONSTRAINT "customer_salesman_id_fkey" FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
    TABLE "orders" CONSTRAINT "orders_salesman_id_fkey" FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)


sales=# select c.customer_id,c.customer_name,s.salesman_id,s.name,s.city,c.city from customer as c,salesman as s where s.city=c.city;
 customer_id | customer_name | salesman_id |   name   |   city    |   city
-------------+---------------+-------------+----------+-----------+-----------
        1004 | Virat         |        5001 | Nikhil   | Bangalore | Bangalore
        1009 | Sharukh       |        5002 | Pavan    | Mumbai    | Mumbai
        1008 | Vijay         |        5003 | Santhosh | Chennai   | Chennai
        1005 | Rakesh        |        5005 | Fazal    | Hyderabad | Hyderabad
(4 rows)



sales=# insert into orders values(7001,25000,'25-10-2021',1001,5001);
INSERT 0 1
sales=# insert into orders values(7002,125000,'24-01-2022',1002,5001);
INSERT 0 1
sales=# insert into orders values(7003,50000,'12-11-2020',1003,5001);
INSERT 0 1
sales=# insert into orders values(7004,5000,'12-21-2021',1004,5002);
INSERT 0 1
sales=# insert into orders values(7005,10000,'16-02-2022',1005,5002);
INSERT 0 1
sales=# insert into orders values(7006,7500,'01-02-2019',1006,5006);
INSERT 0 1
sales=# insert into orders values(7007,9500,'01-02-2017',1007,5005);
INSERT 0 1
sales=# insert into orders values(7008,85000,'17-09-2020',1008,5004);
INSERT 0 1
sales=# insert into orders values(7009,35000,'18-09-2021',1009,5003);
INSERT 0 1


sales=# select * from orders;
 order_id | purchase_amount |    date    | customer_id | salesman_id
----------+-----------------+------------+-------------+-------------
     7001 |           25000 | 25-10-2021 |        1001 |        5001
     7002 |          125000 | 24-01-2022 |        1002 |        5001
     7003 |           50000 | 12-11-2020 |        1003 |        5001
     7004 |            5000 | 12-21-2021 |        1004 |        5002
     7005 |           10000 | 16-02-2022 |        1005 |        5002
     7006 |            7500 | 01-02-2019 |        1006 |        5006
     7007 |            9500 | 01-02-2017 |        1007 |        5005
     7008 |           85000 | 17-09-2020 |        1008 |        5004
     7009 |           35000 | 18-09-2021 |        1009 |        5003
(9 rows)
                                                        

sales=# select o.order_id,o.purchase_amount,c.customer_name,c.city,s.name from orders as o,customer as c,salesman as s where o.customer_id=c.customer_id and o.purchase_amount between 5000 and 7500;
 order_id | purchase_amount | customer_name |   city    |    name
----------+-----------------+---------------+-----------+-------------
     7004 |            5000 | Virat         | Bangalore | Nikhil
     7006 |            7500 | Anmol         | Noida     | Nikhil
     7004 |            5000 | Virat         | Bangalore | Pavan
     7006 |            7500 | Anmol         | Noida     | Pavan
     7004 |            5000 | Virat         | Bangalore | Santhosh
     7006 |            7500 | Anmol         | Noida     | Santhosh
     7004 |            5000 | Virat         | Bangalore | Mallikarjun
     7006 |            7500 | Anmol         | Noida     | Mallikarjun
     7004 |            5000 | Virat         | Bangalore | Fazal
     7006 |            7500 | Anmol         | Noida     | Fazal
     7004 |            5000 | Virat         | Bangalore | Chandru
     7006 |            7500 | Anmol         | Noida     | Chandru
(12 rows)



sales=# 
sales=# select o.order_id,o.purchase_amount,c.customer_name,c.city from orders as o inner join customer as c on o.customer_id=c.customer_id;
 order_id | purchase_amount | customer_name |     city
----------+-----------------+---------------+---------------
     7001 |           25000 | Abhi          | Dharwad
     7002 |          125000 | Nick          | New York
     7003 |           50000 | TomCruise     | California
     7004 |            5000 | Virat         | Bangalore
     7005 |           10000 | Rakesh        | Hyderabad
     7006 |            7500 | Anmol         | Noida
     7007 |            9500 | Rakesh        | Vishakapatnam
     7008 |           85000 | Vijay         | Chennai
     7009 |           35000 | Sharukh       | Mumbai
(9 rows)


//1.query same city 
sales=# select c.customer_id,c.customer_name,s.salesman_id,s.name,s.city,c.city from customer as c,salesman as s where s.city=c.city;
 customer_id | customer_name | salesman_id |   name   |   city    |   city
-------------+---------------+-------------+----------+-----------+-----------
        1004 | Virat         |        5001 | Nikhil   | Bangalore | Bangalore
        1009 | Sharukh       |        5002 | Pavan    | Mumbai    | Mumbai
        1008 | Vijay         |        5003 | Santhosh | Chennai   | Chennai
        1005 | Rakesh        |        5005 | Fazal    | Hyderabad | Hyderabad
(4 rows)

//2. between 5000 and 20000
sales=#sales=# select o.order_id,o.purchase_amount,c.customer_name,c.city from orders as o inner join customer as c on o.customer_id=c.customer_id and o.purchase_amount between 5000 and 20000;
 order_id | purchase_amount | customer_name |     city
----------+-----------------+---------------+---------------
     7004 |            5000 | Virat         | Bangalore
     7005 |           10000 | Rakesh        | Hyderabad
     7006 |            7500 | Anmol         | Noida
     7007 |            9500 | Rakesh        | Vishakapatnam
(4 rows)                                         


sales=# select c.customer_name,c.city,s.name,s.commission from customer as c ,salesman as s where c.salesman_id=s.salesman_id;
 customer_name |     city      |    name     | commission
---------------+---------------+-------------+------------
 Abhi          | Dharwad       | Nikhil      |        0.2
 Nick          | New York      | Nikhil      |        0.2
 TomCruise     | California    | Nikhil      |        0.2
 Virat         | Bangalore     | Pavan       |        0.1
 Rakesh        | Hyderabad     | Pavan       |        0.1
 Anmol         | Noida         | Chandru     |       0.18
 Rakesh        | Vishakapatnam | Fazal       |       0.11
 Vijay         | Chennai       | Mallikarjun |       0.05
 Sharukh       | Mumbai        | Santhosh    |       0.15
(9 rows)

//3. commission more than 12%.
sales=# select c.customer_name,c.city,s.name,s.commission from customer as c ,salesman as s where c.salesman_id=s.salesman_id and s.commission>0.12;
 customer_name |    city    |   name   | commission
---------------+------------+----------+------------
 Abhi          | Dharwad    | Nikhil   |        0.2
 Nick          | New York   | Nikhil   |        0.2
 TomCruise     | California | Nikhil   |        0.2
 Anmol         | Noida      | Chandru  |       0.18
 Sharukh       | Mumbai     | Santhosh |       0.15
(5 rows)                                           

//4.commission 12% in same city.    

sales=# select c.customer_name,c.city,s.name,s.city,s.commission from salesman as s,customer as c where c.city=s.city and s.commission>0.12;
 customer_name |   city    |   name   |   city    | commission
---------------+-----------+----------+-----------+------------
 Virat         | Bangalore | Nikhil   | Bangalore |        0.2
 Vijay         | Chennai   | Santhosh | Chennai   |       0.15
(2 rows)             

//5.details of orders saleman name,commission,customer name;
sales=# select o.order_id,o.date,o.purchase_amount,c.customer_name,c.grade,s.name,s.commission from orders as o,customer as c,salesman as s where o.customer_id=c.customer_id and o.salesman_id=s.salesman_id;
 order_id |    date    | purchase_amount | customer_name | grade |    name     | commission
----------+------------+-----------------+---------------+-------+-------------+------------
     7001 | 25-10-2021 |           25000 | Abhi          |   100 | Nikhil      |        0.2
     7002 | 24-01-2022 |          125000 | Nick          |   200 | Nikhil      |        0.2
     7003 | 12-11-2020 |           50000 | TomCruise     |   500 | Nikhil      |        0.2
     7004 | 12-21-2021 |            5000 | Virat         |   100 | Pavan       |        0.1
     7005 | 16-02-2022 |           10000 | Rakesh        |   150 | Pavan       |        0.1
     7006 | 01-02-2019 |            7500 | Anmol         |   100 | Chandru     |       0.18
     7007 | 01-02-2017 |            9500 | Rakesh        |   200 | Fazal       |       0.11
     7008 | 17-09-2020 |           85000 | Vijay         |   400 | Mallikarjun |       0.05
     7009 | 18-09-2021 |           35000 | Sharukh       |   300 | Santhosh    |       0.15
(9 rows)  