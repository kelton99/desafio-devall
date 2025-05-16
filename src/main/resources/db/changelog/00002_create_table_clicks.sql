--liquibase formatted sql
--changeset kelton:create-table-clicks

CREATE TABLE clicks(
   id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
   post_id INT NOT NULL,
   data DATETIME(6) NOT NULL,
   CONSTRAINT fk_click_post FOREIGN KEY (post_id) REFERENCES posts(id)
);
