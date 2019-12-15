DROP TABLE IF EXISTS animal_entity;
CREATE TABLE animal_entity (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);
INSERT INTO animal_entity (name) VALUES
  ('Pupper'),
  ('Doggo');
