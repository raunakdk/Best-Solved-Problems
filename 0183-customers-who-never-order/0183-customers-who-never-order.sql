# Write your MySQL query statement below
SELECT A.name as Customers FROM Customers A
WHERE A.Id NOT IN (SELECT B.CustomerId from Orders B)