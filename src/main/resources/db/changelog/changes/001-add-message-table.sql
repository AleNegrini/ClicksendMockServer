--changeset alessandro-negrini:20240417225600
CREATE TABLE message (
  id INT auto_increment PRIMARY KEY,
  source VARCHAR(100) NOT NULL,
  body VARCHAR(255) NOT NULL,
  target VARCHAR(100) NOT NULL
);
--rollback DROP TABLE message;