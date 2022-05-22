--users here

INSERT INTO users (id,company,date_of_birth,name,password)
VALUES (1, 'Bright','Wednesday','jem','password');
INSERT INTO users (name, company, password, date_of_birth)
VALUES ('Lewis','BNTA', 'Password1', '1994');

INSERT INTO posts (content_text, number_of_likes, user_id)
VALUES ('Java is so GR8!', 0, 1);



INSERT INTO users (id,company,date_of_birth,name,password)
VALUES (2, 'BNTA', '13/09/1998', 'Scott', 'chickenfella');

INSERT INTO users (id,company,date_of_birth,name,password)
VALUES (3, 'BNTA', '11/07/1864', 'Lewis', 'koolkode');

INSERT INTO users (id,company,date_of_birth,name,password)
VALUES (4, 'BNTA', '23/01/2004', 'Mohamed', 'CLIlover');

INSERT INTO users (id,company,date_of_birth,name,password)
VALUES (5, 'GOD', '25/12/2000BC', 'Jesus', 'holy');

INSERT INTO users (id,company,date_of_birth,name,password)
VALUES (6, 'Hells Kitchen', '25/12/2000BC', 'Gordon Ramsey', 'lambsauce');

-- posts here

INSERT INTO posts (id, content_text,number_of_likes) VALUES (1, 'delighted to be partaking in the BNTA back-end API project. Excited to work with some of the biggest names in the business on this!',200,000,000)
INSERT INTO posts (id, content_text,number_of_likes) VALUES (6, 'wow. the most aMAzing fillet mignon, lathered in THE most incredible peppercorn sauce. THAT is food!',1000)
INSERT INTO posts (id, content_text,number_of_likes) VALUES ('yesterday i missed an interview to feed a dog. the next day i got a call. it was the interviwer offering me the job. i walked in on my first day and met my new boss. it was the dog.',1000)