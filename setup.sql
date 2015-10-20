CREATE TABLE IF NOT EXISTS USER (
  id int(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(25) NOT NULL,
  password VARCHAR(100) NOT NULL,
  firstname VARCHAR(25) NOT NULL,
  lastname VARCHAR(25) NOT NULL,
  email VARCHAR(100) NOT NULL,
  office_id INT DEFAULT '0',
  role VARCHAR(25) NOT NULL,
  PRIMARY KEY (id)
);
TRUNCATE USER;
INSERT INTO USER (username, password, firstname, lastname, email, office_id,role)
  VALUES ('admin1', 'e00cf25ad42683b3df678c61f42c6bda', 'Michael', 'Jordan', 'admin@worksap.co.jp', 0, 'ADMIN'),
         ('user1', '24c9e15e52afc47c225b757e7bee1f9d', 'Tim', 'Duncan', 'user001@worksap.co.jp', 1, 'USER');
         
CREATE TABLE IF NOT EXISTS OFFICE (
  id INT(11) NOT NULL AUTO_INCREMENT,
  name varchar(50),
  PRIMARY KEY (id)
);
TRUNCATE OFFICE;
INSERT INTO OFFICE (name) VALUES ('Tokyo'), ('Shanghai'), ('Singapore'), ('Osaka');