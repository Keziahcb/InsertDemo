create table Customer_20(CUSTOMERID NUMBER(4) primary key,
FIRSTNAME varchar2(30) not null,LASTNAME varchar2(30) not null, DOB DATE not null,
GENDER varchar2(7) not null, CITY varchar2(50), COUNTRY varchar2(25), EMAIL varchar2(50),
ANNUAL_SALARY NUMBER(20,5) not null
);
Drop table Customer_20;
select * from Customer_20;
CREATE SEQUENCE custSeq1
MINVALUE 100
MAXVALUE 1000
START WITH 100
INCREMENT BY 1;

select custSeq1.nextval from dual;