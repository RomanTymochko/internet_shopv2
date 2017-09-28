create database shop_version_2;
use shop_version_2;

-- Table: User
CREATE TABLE User (
  id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50)  NOT NULL,
  password VARCHAR(255) NOT NULL,
  contacts_id INT,
  FOREIGN KEY (contacts_id) REFERENCES Contacts(id)
)
  ENGINE = InnoDB;

-- Table: Role
CREATE TABLE Role (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(25)  NOT NULL
)
  ENGINE = InnoDB;

-- Table: Product
CREATE TABLE Product (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50)  NOT NULL,
  description VARCHAR(255),
  price DOUBLE,
  image_id INT,
  category_id INT,

  FOREIGN KEY (image_id) REFERENCES Image(id),
  FOREIGN KEY (category_id) REFERENCES Category (id)
)
  ENGINE = InnoDB;

-- Table: Category
CREATE TABLE Category (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  parent_id INT
)
  ENGINE = InnoDB;

-- Table: Cart
CREATE TABLE Cart (
  id   INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  product_id INT,
  quantity INT,
  total_price DOUBLE,
  FOREIGN KEY (product_id) REFERENCES Product (id)
)
  ENGINE = InnoDB;

-- Table: Orders
CREATE TABLE Orders (
  id   INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id INT,
  cart_id INT,
  comment VARCHAR(255),
  FOREIGN KEY (user_id) REFERENCES User (id),
  FOREIGN KEY (cart_id) REFERENCES Cart (id)
)
  ENGINE = InnoDB;

-- Table: Contacts
CREATE TABLE Contacts (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(25),
  last_name VARCHAR(25),
  phone_number VARCHAR(15),
  e_mail VARCHAR(50)
)
  ENGINE = InnoDB;

-- Table: Options
CREATE TABLE Options (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  color VARCHAR(25),
  size VARCHAR(10),
  width INT,
  height INT,
  weight DOUBLE
)
  ENGINE = InnoDB;

-- Table: Image
CREATE TABLE Image(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  URL VARCHAR(255)
)
  ENGINE = InnoDB;

-- Table for mapping User and Roles: User_Roles
CREATE TABLE User_Roles (
  user_id INT     NOT NULL,
  role_id INT     NOT NULL,

  FOREIGN KEY (user_id) REFERENCES User (id),
  FOREIGN KEY (role_id) REFERENCES Role (id),

  UNIQUE (user_id, role_id)
)
  ENGINE = InnoDB;

-- Insert data
INSERT INTO Contacts VALUES (1, 'Roman', 'Tymochko', '380986641079','romantymochko@gmail.com');
INSERT INTO User VALUES (1, 'admin', '$2a$10$OgXxJur6OxgeaCwK3i3VnO9VNeHZR.JqwR5eX6EY.LmvSTWicLyYq',1);

INSERT INTO Role VALUES (1, 'ROLE_USER');
INSERT INTO Role VALUES (2, 'ROLE_ADMIN');

INSERT INTO User_Roles VALUES (1, 2);