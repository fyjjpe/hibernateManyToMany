CREATE TABLE project(
  proid int PRIMARY KEY ,
  proname VARCHAR (20) NOT NULL
);

CREATE TABLE employee (
  empid int PRIMARY KEY ,
  empname VARCHAR (20)
);

CREATE TABLE proemp(
 rproid int,
 rempid int
);

ALTER TABLE proemp add CONSTRAINT fk_rproid FOREIGN KEY (rproid) REFERENCES project(proid);
ALTER TABLE proemp add CONSTRAINT fk_rempid FOREIGN KEY (rempid) REFERENCES employee(empid);