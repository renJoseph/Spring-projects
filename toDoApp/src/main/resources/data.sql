DROP TABLE IF EXISTS notes;
 
CREATE TABLE notes (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(75) NOT NULL,
  text VARCHAR(500) NOT NULL
);
 
INSERT INTO notes (title, text) VALUES
  ('Thought 1','what a lovely application Ren has made'),
  ('Thought 2','I would love to pay Ren to develop for me');

