use company;
select * from employees;
select country_name from countries;
select employee_id as ID,first_name as FNAME,email as EMAIL,phone_number as PH_NO  from employees;
select * from employees where last_name='Fay';
select last_name,hire_date from employees where last_name='Grant' or last_name='Whalen';
select employee_id,first_name,last_name,jobs.job_title from employees 
join jobs on employees.job_id=jobs.job_id where jobs.job_title='Shipping Clerk';

select  * ,departments.department_id from employees 
join departments on employees.department_id=departments.department_id where departments.department_id=8; 

select department_id,department_name from departments order by department_id desc;
select * from employees where last_name like 'k%';
select first_name,last_name,hire_date  from employees where hire_date between '1995-01-01' and '1997-12-31';
select * from jobs where max_salary<7000; 
select upper(email) as upper_email from employees;
select first_name,last_name,hire_date from employees where extract(year from hire_date)=1995;
insert into employees(employee_id,first_name,last_name,department_id) values(210,'Paul', 'Newton',11);
select * from departments;
set sql_safe_updates=0;
DELETE FROM departments WHERE department_name = 'Shipping';
delete from departments where department_name='IT';
