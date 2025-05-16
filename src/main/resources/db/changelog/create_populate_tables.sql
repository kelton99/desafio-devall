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

CREATE TABLE clicks(
   id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
   post_id INT NOT NULL,
   data DATETIME(6) NOT NULL,
   CONSTRAINT fk_click_post FOREIGN KEY (post_id) REFERENCES posts(id)
);

INSERT INTO posts (titulo, resumo, autor, url, data) VALUES ('Curso Básico da Linguagem C - Aula #12', 'Ultima aula do Curso de C onde iremos continuar aprendendo sobre leitura e escrita ', 'Debxp','https://www.youtube.com/watch?v=B42KIZfivsg', '2025-04-21 00:00:00');
INSERT INTO posts (titulo, resumo, autor, url, data) VALUES ('Vite Crash Course', 'Vite is a build tool that allows you to start up your project instantly and see changes you make immediately.', 'FreecodeCamp.org','https://www.youtube.com/watch?v=do62-z3z6FM', '2025-05-14 00:00:00');
INSERT INTO posts (titulo, resumo, autor, url, data) VALUES ('5 estruturas de dados estranhas (mas úteis) na ciência da computação','Vamos dar uma olhada em cinco estruturas de dados estranhas que podem te ajudar quando os arrays e hashmaps deste mundo não conseguem dar conta do recado.', 'FreecodeCamp.org', 'https://www.youtube.com/watch?v=6fnmXX8RK0s', '2025-05-15 00:00:00');
INSERT INTO posts (titulo, resumo, autor, url, data) VALUES ('Detecte erros de forma fácil (com AddressSanitizer)','Todo mundo comete erros. Este vídeo mostra uma maneira fácil de detectar seus erros de código — especificamente aqueles que envolvem memória (vazamentos, liberações duplas, uso após liberação).','Jacob Sorber','https://www.youtube.com/watch?v=_Al7Y7BI-ds', '2025-02-25 00:00:00');
