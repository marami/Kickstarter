use kickstarter;
INSERT INTO question (time, question, answer, project_id)

VALUES 
('Wed Nov 12 15:51:29 EET 2015','How can I pledge for multiple items please as I would also like The Black Magick book signed and Jons sculpture ', 'I ran into the same issue as you. I wanted to back different levels. I talked to Jon and the only way to do it is to make a separate KS account and back whatever else you want.',  
(select id from project where name='Flobots\' TWO NEW ALBUMS for 2016 "NOENEMIES"')),
('Wed Nov 15 15:52:19 EET 2015','How are you?', '-',
(select id from project where name='Flobots\' TWO NEW ALBUMS for 2016 "NOENEMIES"'));