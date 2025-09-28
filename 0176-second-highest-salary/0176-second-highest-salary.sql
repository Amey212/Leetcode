# Write your MySQL query statement below
Select MAX(salary) as SecondHighestSalary 
FROM Employee
WHERE salary < (Select MAX(salary)FROM Employee);