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

