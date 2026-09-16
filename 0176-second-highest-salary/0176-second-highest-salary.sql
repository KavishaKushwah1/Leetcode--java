# Write your MySQL query statement below
select(
    select distinct salary 
    from(
        select
        salary, 
            dense_rank() over (order by salary desc) as rnk
        from employee
    )as Ranked
    where rnk =2
)as SecondHighestSalary;