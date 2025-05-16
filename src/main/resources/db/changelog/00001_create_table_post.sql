--liquibase formatted sql
--changeset kelton:create-table-post

CREATE TABLE posts(
   id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
   titulo VARCHAR(255),
   resumo TEXT,
   autor VARCHAR(255),
   url VARCHAR(255),
   data DATETIME(6) NOT NULL
);

