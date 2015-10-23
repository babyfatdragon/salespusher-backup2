CREATE TABLE IF NOT EXISTS USERS (
  id INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(25) NOT NULL,
  password VARCHAR(100) NOT NULL,
  firstname VARCHAR(25) NOT NULL,
  lastname VARCHAR(25) NOT NULL,
  email VARCHAR(100) NOT NULL,
  office_id TINYINT DEFAULT '0',
  role VARCHAR(25) NOT NULL,
  PRIMARY KEY (id)
);
TRUNCATE USERS;
INSERT INTO USERS (username, password, firstname, lastname, email, office_id,role)
  VALUES ('admin1', 'e00cf25ad42683b3df678c61f42c6bda', 'Michael', 'Jordan', 'admin@worksap.co.jp', 0, 'ADMIN'),
         ('user1', '24c9e15e52afc47c225b757e7bee1f9d', 'Tim', 'Duncan', 'user001@worksap.co.jp', 1, 'USER');
         
CREATE TABLE IF NOT EXISTS OFFICES (
  id INT(11) NOT NULL AUTO_INCREMENT,
  name varchar(25),
  PRIMARY KEY (id)
);
TRUNCATE OFFICES;
INSERT INTO OFFICES (name) VALUES ('Tokyo'), ('Shanghai'), ('Singapore'), ('Osaka');

CREATE TABLE IF NOT EXISTS PRODUCTS (
	id INT(11) NOT NULL AUTO_INCREMENT,
	product_name VARCHAR(25) NOT NULL,
	first_category TINYINT NOT NULL,
	second_category TINYINT NOT NULL,
	overview TEXT,
	technology TEXT,
	specification TEXT,
	price INT(11),
	PRIMARY KEY (id)
);
TRUNCATE PRODUCTS;
INSERT INTO PRODUCTS (product_name,first_category,second_category,overview,technology,specification,price) VALUES 
('Discovery XR656 Plus',1,1,'Discovery* XR656 Plus lets you enjoy productivity and workflow benefits thanks to FlashPad*, 
a wireless detector that was designed—from the beginning—for advanced digital imaging. 
Our suite of advanced clinical capabilities helps you address complex clinical needs while differentiating your facility from others. ',
'Advance your clinical capabilities
FlashPad Digital radiography detector 
Gain control over your workflow
Service you can count on!',
'',
250000),
('Definium 5000',1,2,
'The Definium 5000 is a compact and versatile digital radiography system. 
It’s well-suited for the demands of high-volume imaging, especially in treatment centers where space is at a premium, 
such as orthopedic and sports medicine facilities, physician offices, satellite offices and stand-alone imaging centers. 
It’s an affordable digital solution in a compact system.',
'Amorphous silicon non-tiled digital detector with cesium iodide scintillator
Patient-side collimator and technique controls with digital display (e.g. mA, kVp, mAs)
Patient-side automated positioning selection
Patient-side selection of pre-programmed U-arm positions
High DQE for excellent image quality and dose efficiency',
'The Definium 5000 digital radiographic imaging system is designed as a compact, 
digital imaging system for use in hospital emergency departments, 
orthopedic centers, and to support most general radiology applications. 
It provides excellent image quality, image manipulation and dose reporting. 
These features help make the system reliable and easy to use while providing high-quality radiographic images in a digital environment.',
225000),
('Discovery PET/CT 610',2,3,
'GE Healthcare is proud to announce that the Discovery* PET/CT 610 has achieved an absolute sensitivity of 10.0 cps/kBq, 
the highest level found on any scanner on the market.1 Sensitivity is one of GE’s critical foundations of PET/CT imaging, 
and this double-digit measurement represents a critical milestone. It means the system is designed to deliver fast and detailed scans at low dose.',
'Innovations with a 40-mm detector at 0.35-sec rotation speed.
Up to 60% lower CO2 emissions using the energy saving mode.
Advanced applications to help clinicians make a fast and confident diagnosis.
ASiR2 technology may allow for reduced mA in the acquisition of diagnostic images.
Simplified workflow for quick and streamlined operation.
Scalable, modular design for ease of service.
128-slice axial overlapped reconstruction for improved Z-axis visualization compared to non-overlapped reconstruction.',
'',
350000);

CREATE TABLE IF NOT EXISTS IMAGES (
	id INT(11) NOT NULL AUTO_INCREMENT,
	product_id INT(11) NOT NULL,
	image_file_url VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);
TRUNCATE IMAGES;

CREATE TABLE IF NOT EXISTS DOCUMENTS (
	id INT(11) NOT NULL AUTO_INCREMENT,
	product_id INT(11) NOT NULL,
	doc_file_url VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);

TRUNCATE DOCUMENTS;

CREATE TABLE IF NOT EXISTS CATEGORYONE (
	id INT(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(25) NOT NULL,
	PRIMARY KEY (id)
);
TRUNCATE CATEGORYONE;
INSERT INTO CATEGORYONE (name) VALUES ('Radiography'), ('PET/CT');


CREATE TABLE IF NOT EXISTS CATEGORYTWO (
	id INT(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(25) NOT NULL,
	categoryone_id INT(11) NOT NULL,
	PRIMARY KEY (id)
);
TRUNCATE CATEGORYTWO;
INSERT INTO CATEGORYTWO (name,categoryone_id) VALUES ('Fixed RAD Systems',1), ('Mobile X-Ray Systems',1), ('PET/CT Scanners',2);

