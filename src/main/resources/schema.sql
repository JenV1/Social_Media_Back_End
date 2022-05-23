DROP TABLE IF EXISTS interests_mapper;
DROP TABLE IF EXISTS interest_types;
DROP TABLE IF EXISTS post_types CASCADE;
DROP TYPE IF EXISTS interests_career;
DROP TYPE IF EXISTS posts_type;



CREATE TYPE interests_career AS ENUM ('SOFTWARE_ENGINEERING',
                                          'MACHINE_LEARNING',
                                          'AI',
                                          'ROBOTICS',
                                          'FULL_STACK_DEVELOPMENT',
                                          'BACK_END_DEVELOPMENT',
                                          'FRONT_END_DEVELOPMENT',
                                          'BUSINESS_DEVELOPMENT',
                                          'ENTREPRENEURSHIP',
                                          'ART',
                                          'LITERATURE',
                                          'LOCAL_EVENTS',
                                          'INVESTING',
                                          'STARTING_A_BUSINESS',
                                          'WOMEN_IN_TECH',
                                          'BAME_IN_TECH',
                                          'VETERANS_IN_TECH',
                                          'BANKING_AND_FINANCE',
                                          'MEDITATION_AND_SPIRITUALITY',
                                          'PHOTOGRAPHY');

CREATE TABLE interest_types (

    id SERIAL PRIMARY KEY,
    interests interests_career
);



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


CREATE TABLE interests_mapper (


    interests_id INTEGER ,
    user_id INTEGER ,
    FOREIGN KEY (interests_id) REFERENCES interest_types (id),
    FOREIGN KEY (user_id) REFERENCES users (id)

);

CREATE TYPE posts_type AS ENUM ('ADVERTISEMENT','EVENT','LIFESTYLE','FUNDRAISER','EVENT_PLAN');

CREATE TABLE post_types (

    id SERIAL PRIMARY KEY,
    post_type posts_type
);




INSERT INTO post_types (post_type) VALUES ('ADVERTISEMENT');
INSERT INTO post_types (post_type) VALUES ('EVENT');
INSERT INTO post_types (post_type) VALUES ('LIFESTYLE');
INSERT INTO post_types (post_type) VALUES ('FUNDRAISER');
INSERT INTO post_types (post_type) VALUES ('EVENT_PLAN');

ALTER TABLE posts ADD FOREIGN KEY (post_types_id) REFERENCES post_types (id);




