SELECT * FROM learning.orders;

select sum(amount) from learning.orders;

select salesperson_id, sum(amount) from learning.orders; 
-- this will provide only one row 


select salesperson_id, sum(amount) from learning.orders order by salesperson_id;
 -- nothing same as above  

select salesperson_id, sum(amount) from learning.orders group by salesperson_id;
-- this will give us result which we want of printing one salesperson _id and then sum of those

select *, sum(amount) over() as total_sales from learning.orders; -- showing sum in all of the columns as whole table is the working window here in over().

select * , sum(amount) over( partition by salesperson_id) as total_sales from learning.orders;

select * , sum(amount) over( ORDER by order_date) as total_sales from learning.orders;

select * , sum(amount) over( partition by salesperson_id order by order_date) as total_sales from learning.orders;

select * , sum(amount) over( partition by salesperson_id) as total_sales from learning.orders;

