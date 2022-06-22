--users here

-- For ENUM tables
INSERT INTO post_types (post_type) VALUES ('ADVERTISEMENT');
INSERT INTO post_types (post_type) VALUES ('EVENT');
INSERT INTO post_types (post_type) VALUES ('LIFESTYLE');
INSERT INTO post_types (post_type) VALUES ('FUNDRAISER');
INSERT INTO post_types (post_type) VALUES ('EVENT_PLAN');

INSERT INTO interest_types (interests) VALUES ('SOFTWARE_ENGINEERING');
INSERT INTO interest_types (interests) VALUES ('MACHINE_LEARNING');
INSERT INTO interest_types (interests) VALUES ('AI');
INSERT INTO interest_types (interests) VALUES ('ROBOTICS');
INSERT INTO interest_types (interests) VALUES ('FULL_STACK_DEVELOPMENT');
INSERT INTO interest_types (interests) VALUES ('BACK_END_DEVELOPMENT');
INSERT INTO interest_types (interests) VALUES ('FRONT_END_DEVELOPMENT');
INSERT INTO interest_types (interests) VALUES ('BUSINESS_DEVELOPMENT');
INSERT INTO interest_types (interests) VALUES ('ENTREPRENEURSHIP');
INSERT INTO interest_types (interests) VALUES ('ART');
INSERT INTO interest_types (interests) VALUES ('LITERATURE');
INSERT INTO interest_types (interests) VALUES ('LOCAL_EVENTS');
INSERT INTO interest_types (interests) VALUES ('INVESTING');
INSERT INTO interest_types (interests) VALUES ('STARTING_A_BUSINESS');
INSERT INTO interest_types (interests) VALUES ('WOMEN_IN_TECH');
INSERT INTO interest_types (interests) VALUES ('BAME_IN_TECH');
INSERT INTO interest_types (interests) VALUES ('VETERANS_IN_TECH');
INSERT INTO interest_types (interests) VALUES ('BANKING_AND_FINANCE');
INSERT INTO interest_types (interests) VALUES ('MEDITATION_AND_SPIRITUALITY');
INSERT INTO interest_types (interests) VALUES ('PHOTOGRAPHY');


--users here

INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA','Software Engineer','Wednesday','Jem','password');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA','Software Engineer','13/09/1998', 'Scott', 'chickenfella');



-- posts here
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('As King SQL, I must be head of the round table', 5043, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Nice to meet you internet', 5043, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Currently existing', 0, 3, 2);

-- Inserts for the message table

--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('This multidirectional mapping thing is pretty cool', 2, 3);
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('Damn I just LOVE Spring Boot!', 1, 4);
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('You seen Pingu just dropped a new mixtape?', 4, 1);
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('When you gonna release Full Moon?', 1, 2);
--
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('I think we will end up hiring all these guys', 11, 12);
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('No... WE are gonna hire all these guys! Think you should sit this one out', 12, 11);
--
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('Its always the bloody LAMB SAUCE!!!', 5, 6);
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('New numba, who dis?', 6, 5);
--
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('Who you got for the champs league?', 3, 2);
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('When I grow up I wanna be Pingu', 1, 2);
--
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('Fancy coming round mine for a few beers?', 5, 6);
--INSERT INTO message (message_content, receiver_id, sender_id) VALUES ('Soz Gordon getting resurrected tonight', 6, 5);


INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA', 'Software Engineer','11/07/1864', 'Lewis', 'koolkode');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA', 'Software Engineer','23/01/2004', 'Mohamed', 'CLIlover');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Woolworths', 'Manager', '24/01/1998', 'Katya', 'secret');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('NASA', 'Astronaut', '07/05/1990', 'James', 'cheese');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Netflix', 'Editor', '17/09/1975', 'Jenna', 'yeehaw');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Woofs', 'Dogwalker', '09/12/1984', 'Carol', 'rabbit');
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Javascript is the superior coding language, change my mind', 123,1,1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('How to make yourself cry, try css styling', 123,1,2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Travelling abroad, where not to go', 123,1,3);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Feel good friday!', 123,1,4);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Party parrot partied too hard', 123,1,5);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('How to eat cake every morning and get away with it', 123,1,6);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Why is the news always sad', 123,1,7);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Why do buses come in threes', 123,1,8);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Humble pi', 123,1,1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Schrodingers bug', 123,1,2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Who wore it best, BNTA trainer edition', 123,1,3);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Farm tycoon: farming made fun', 123,1,4);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Muse360: your go to museum management tool', 123,1,5);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Car sales: functional yet affordable', 123,1,6);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Connect: a broken back end project ', 123,1,7);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Dench pingu is king, fight me', 123,1,8);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Noot noot', 123,1,1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Pokemon: gotta catch em all using HTML and CSS', 123,1,2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Why Sheffield is better than London', 123,1,1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Allez Team Atos', 123,1,3);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('5B is 5 BEST', 123,1,2);