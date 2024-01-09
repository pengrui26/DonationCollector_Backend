DROP TABLE IF EXISTS ngo;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL,
    phone_num VARCHAR(20) NOT NULL,
    password VARCHAR(100) NOT NULL
);



CREATE TABLE item
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    size ENUM('SMALL', 'MEDIUM', 'LARGE') NOT NULL,
    category VARCHAR(255) NOT NULL,
    photo_url VARCHAR(255),
    address VARCHAR(255),
    time VARCHAR(255),
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE ngo
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    phone_num VARCHAR(20) NOT NULL,
    password VARCHAR(100) NOT NULL
);

INSERT INTO user (username, email, phone_num, password) VALUES ('user1', 'user1@example.com', '123-456-7890', 'password1');
INSERT INTO user (username, email, phone_num, password) VALUES ('user2', 'user2@example.com', '098-765-4321', 'password2');


INSERT INTO item (size, category, photo_url, address, time, user_id) VALUES ('SMALL', 'Category1', 'url1', 'Address1', 'Time1', 1);
INSERT INTO item (size, category, photo_url, address, time, user_id) VALUES ('LARGE', 'Category2', 'url2', 'Address2', 'Time2', 2);

INSERT INTO ngo (phone_num, password) VALUES ('111-222-3333', 'ngopassword1');
INSERT INTO ngo (phone_num, password) VALUES ('444-555-6666', 'ngopassword2');
