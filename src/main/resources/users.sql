CREATE TABLE 'user' (
  'id'          INT UNIQUE NOT NULL,
  'name'        VARCHAR(40),
  'description' VARCHAR(50),
  PRIMARY KEY (id)
);
INSERT INTO user VALUES (1, 'Mercedes', '2000');
INSERT INTO user VALUES (2, 'BMW', '2004');
INSERT INTO user VALUES (3, 'Audi', '2001');