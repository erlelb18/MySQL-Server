create database if not exists MySQLServer_OlgerErlisa_2025;
use MySQLServer_OlgerErlisa_2025;
drop table if exists books;

CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    published_year INT
);

INSERT INTO books (title, author, published_year) VALUES
('Vagabond', 'Takehiko Inoue', 1998),
('REAL', 'Takehiko Inoue', 1999),
('Monster', 'Naoki Urasawa', 1994);

select * from books;
