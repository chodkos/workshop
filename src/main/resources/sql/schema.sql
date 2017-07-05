DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  ID    BIGSERIAL NOT NULL PRIMARY KEY,
  NAME  TEXT   NOT NULL

);

INSERT INTO customer (NAME) VALUES ('Wacław');
INSERT INTO customer (NAME) VALUES ('Czesław');
INSERT INTO customer (NAME) VALUES ('Lesław');
INSERT INTO customer (NAME) VALUES ('TeżJest');