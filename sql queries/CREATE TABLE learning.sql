CREATE TABLE learning.orders(
 order_number int NOT NULL,
 order_date date NOT NULL,
 cust_id int NOT NULL,
 salesperson_id int NOT NULL,
 amount float NOT NULL
);

INSERT learning.orders (order_number, order_date, cust_id, salesperson_id, amount) VALUES (30, '1995-07-14' , 9, 1, 460);
INSERT learning.orders (order_number, order_date, cust_id, salesperson_id, amount) VALUES (10, '1996-08-02' , 4, 2, 540);
INSERT learning.orders (order_number, order_date, cust_id, salesperson_id, amount) VALUES (40, '1998-01-29' , 7, 2, 2400);
INSERT learning.orders (order_number, order_date, cust_id, salesperson_id, amount) VALUES (50, '1998-02-03' , 6, 7, 600);
INSERT learning.orders (order_number, order_date, cust_id, salesperson_id, amount) VALUES (60, '1998-03-02' , 6, 7, 720);
INSERT learning.orders (order_number, order_date, cust_id, salesperson_id, amount) VALUES (70, '1998-05-06' , 9, 7, 150);
INSERT learning.orders (order_number, order_date, cust_id, salesperson_id, amount) VALUES (20, '1999-01-30' , 4, 8, 1800);
     