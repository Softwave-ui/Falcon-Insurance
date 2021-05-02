-- drop database Insurance;

CREATE DATABASE Insurance;
USE Insurance;
-- drop database Insurance;
CREATE TABLE Client_
(
client_id INT UNIQUE AUTO_INCREMENT,
client_name VARCHAR(256),
client_gender VARCHAR(6),
client_address VARCHAR(256),
client_phone_number VARCHAR(20),
client_email VARCHAR(256),
Client_age INT,
credit_score INT,
PRIMARY KEY (client_id)
);
INSERT INTO Client_(client_id,client_name,client_gender,client_address,client_phone_number,client_email,Client_age,credit_score)
VALUES
(1,"Prince Hossain","Male","Street1234","123456789","sample@gmail.com",23,200000),
(2,"Elon Musk","Male","Street1","4534657","afrgr@gmail.com",25,357584),
(3,"Tom Brady","Female","Street2","3465768","safesg@gmail.com",22,200350),
(4,"Bob","Female","Street3","14355768","fesgrg@gmail.com",21,4287695),
(5,"John","Male","Street4","143576875","agrgte@gmail.com",20,2546578);

CREATE TABLE Driving_License    
(
    license_id int unique auto_increment,
    client_id  INT,
    driving_skills varchar(256),
    issue_date DATE,
    Expiry_date DATE,
    PRIMARY KEY (license_id),
	FOREIGN KEY (client_id)  REFERENCES Client_(client_id)
);

INSERT INTO Driving_License(license_id,client_id,driving_skills,issue_date,Expiry_date)
VALUE
(1,1,"Good","2018-01-01","2028-01-01"),
(2,2,"Excellent","2019-02-01","2029-02-01"),
(3,3,"Weak","2018-01-01","2028-01-01"),
(4,4,"Normal","2020-01-01","2030-01-01"),
(5,5,"Good","2015-01-01","2025-01-01");
CREATE TABLE Car
(
car_id  INT UNIQUE AUTO_INCREMENT,
client_id  INT,
company_name  VARCHAR(256),
model_name  VARCHAR(256),
year_made  INT,
price  INT,
condition_ VARCHAR(256),
PRIMARY KEY (car_id),
    FOREIGN KEY (client_id)  REFERENCES Client_(client_id)
);
INSERT INTO Car(car_id,client_id,company_name,model_name,year_made,price,condition_)
VALUES
(1 ,1 , "Honda","Civic",2018 ,1535000 ,"Good"),
(2 ,2 , "Honda","City",2018 ,15250 ,"Normal"),
(3 ,3 , "Honda","Civic",2018 ,15400 ,"New"),
(4 ,4 , "Honda","Civic",2018 ,10440 ,"Old"),
(5 ,5 , "Honda","Civic",2018 ,104100 ,"Poor");
CREATE TABLE employee
(
employee_id  INT UNIQUE AUTO_INCREMENT,
name_  VARCHAR(256),
gender  VARCHAR(6),
address  VARCHAR(256),
phone_number  VARCHAR(20),
email  VARCHAR(256 ),
age  INT,
salary  INT,
PRIMARY KEY (employee_id)
);    
INSERT INTO employee(employee_id,name_,gender,address,phone_number,email,age,salary)
VALUES
( 1,"Jack","Male","St 123","34578422","jack@gmail.com",45,45000),
( 2,"OPor","female","St 123","3764328422","OPor@gmail.com",45,45000),
( 3,"Jaolo","Male","St 123","3547422","Jaolo@gmail.com",45,45230),
( 4,"Jmine","Male","St 123","342352422","Jmine@gmail.com",45,45000),
( 5,"Jako","Male","St 123","3457657422","Jako@gmail.com",45,453320);
CREATE TABLE Insurance_Type
(
type_id  INT UNIQUE AUTO_INCREMENT,
amount_paid  INT,
amount_received  INT,
PRIMARY KEY (type_id)
);
INSERT INTO Insurance_Type (type_id,amount_paid,amount_received)
VALUES
(1,10000,10000),
(2,20000,20000),
(3,30000,30000),
(4,40000,40000),
(5,50000,50000);
CREATE TABLE Insurance
(
insurance_id INT UNIQUE AUTO_INCREMENT,
client_id  INT,
employee_id  INT,
type_id  INT,
start_date DATE,
end_date  DATE,
PRIMARY KEY (insurance_id),
FOREIGN KEY (client_id)  REFERENCES Client_(client_id),
FOREIGN KEY (employee_id)  REFERENCES employee(employee_id),
FOREIGN KEY (type_id)  REFERENCES Insurance_Type(type_id)
);
INSERT INTO Insurance(insurance_id,client_id,employee_id,type_id,start_date,end_date)
VALUES
(1,1,1,1,"2019-02-03","2029-02-03"),
(2,2,2,2,"2015-02-03","2025-02-03"),
(3,3,3,3,"2014-02-03","2024-02-03"),
(4,4,4,4,"2020-02-03","2040-02-03"),
(5,5,5,5,"2019-02-03","2039-02-03");
CREATE TABLE Installments
(
installment_id  INT UNIQUE AUTO_INCREMENT,
insurance_id INT,
issue_date DATE,
due_date  DATE,
pay_date  DATE,
amount  INT,
PRIMARY KEY (installment_id),
FOREIGN KEY (insurance_id)  REFERENCES Insurance(insurance_id)
);

select * from Installments;

INSERT INTO Installments(installment_id,insurance_id,issue_date,due_date,pay_date,amount)
VALUES
(1,1,"2021-04-05","2021-04-10","2021-04-08",500),
(2,2,"2021-04-05","2021-04-10","2021-04-08",500),
(3,3,"2021-04-05","2021-04-10","2021-04-08",500),
(4,4,"2021-04-05","2021-04-10","2021-04-08",500),
(5,5,"2021-04-05","2021-04-10","2021-04-08",500);

-- @author Prince Hossain