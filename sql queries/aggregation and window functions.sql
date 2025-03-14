SELECT * FROM orders;

select sum(amount) from orders;

select salesperson_id, sum(amount) from orders; 
-- this will provide only one row 


select salesperson_id, sum(amount) from orders order by salesperson_id;
 -- nothing same as above  

select salesperson_id, sum(amount) from orders group by salesperson_id;
-- this will give us result which we want of printing one salesperson _id and then sum of those

select *, sum(amount) over() as total_sales from orders;
-- showing sum in all of the columns as whole table is the working window here in over().

select * , sum(amount) over( partition by salesperson_id) as total_sales from orders;
-- showing us total sum in all the rows for each id as it is calculated

select * , sum(amount) over( ORDER by order_date) as total_sales from orders;
-- here firstly we ordered the table by order date and then we did sum and its a running sum means its showing whats the total till that row

select * , sum(amount) over( partition by salesperson_id order by order_date) as total_sales from orders;
--will show a running sum in each partition.

select * , sum(amount) over(order by order_date rows between 2 preceding and current row) as total_sales from orders;
-- shows us sum of two preceeding columns for each row.

select * , sum(amount) over( partition by salesperson_id rows between 2 preceding and current row) as total_sales from orders;
-- shows us sum of two preceeding columns for each row in a partition.

select * , sum(amount) over( partition by salesperson_id rows between 2 preceding and 1 preceding) as total_sales from orders;
-- shows us sum of two preceeding  and 1 preceding means rows 2 above the current and 1 above the current row for each row in a partition.

select * , sum(amount) over( partition by salesperson_id rows between 1 preceding and 1 following) as total_sales from orders;
-- now one following is also considered and current row is also considered. as we are mentioning rows between

