DROP TABLE IF EXISTS
CREATE TABLE counter (
  id          INT,
  num         INT,
  PRIMARY KEY (id)
);

INSERT INTO counter(id, num) values(1, 0);
