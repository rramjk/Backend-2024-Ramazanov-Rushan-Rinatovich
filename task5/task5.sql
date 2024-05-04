drop table if exists Users;
drop table if exists Department;
CREATE TABLE Department(
                           ID INT PRIMARY KEY AUTO_INCREMENT,
                           SALARY VARCHAR(100)
);
CREATE TABLE Users(
                      ID INT PRIMARY KEY AUTO_INCREMENT,
                      SURNAME VARCHAR(100),
                      DEPARTMENT_ID INT REFERENCES Department(ID),
                      SALARY INT
);

INSERT INTO Department(SALARY) VALUES ('Backend');
INSERT INTO Department(SALARY) VALUES ('DevOps');
INSERT INTO Department(SALARY) VALUES ('Android');
INSERT INTO Department(SALARY) VALUES ('IOS');

INSERT INTO Users(surname, department_id, salary) VALUES ('Алексеев', 3, 50000);
INSERT INTO Users(surname, department_id, salary) VALUES ('Петрухин', 3, 60000);
INSERT INTO Users(surname, department_id, salary) VALUES ('Есенин', 2, 70000);
INSERT INTO Users(surname, department_id, salary) VALUES ('Маяковский', 1, 80000);
INSERT INTO Users(surname, department_id, salary) VALUES ('Нортон', 4, 90000);
INSERT INTO Users(surname, department_id, salary) VALUES ('Антропов', 1, 100000);
INSERT INTO Users(surname, department_id, salary) VALUES ('Андреев', 4, 110000);
INSERT INTO Users(surname, department_id, salary) VALUES ('Силантьев', 1, 120000);

SELECT * FROM Users ORDER BY SALARY;