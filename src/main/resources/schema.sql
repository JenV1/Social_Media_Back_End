DROP TABLE IF EXISTS interests_mapper;
DROP TABLE IF EXISTS interests_table;
DROP TYPE IF EXISTS interests_career;






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

CREATE TABLE interests_table (

    id SERIAL PRIMARY KEY,
    interests interests_career
);







INSERT INTO interests_table (interests) VALUES ('SOFTWARE_ENGINEERING');
INSERT INTO interests_table (interests) VALUES ('MACHINE_LEARNING');
INSERT INTO interests_table (interests) VALUES ('AI');
INSERT INTO interests_table (interests) VALUES ('ROBOTICS');
INSERT INTO interests_table (interests) VALUES ('FULL_STACK_DEVELOPMENT');
INSERT INTO interests_table (interests) VALUES ('BACK_END_DEVELOPMENT');
INSERT INTO interests_table (interests) VALUES ('FRONT_END_DEVELOPMENT');
INSERT INTO interests_table (interests) VALUES ('BUSINESS_DEVELOPMENT');
INSERT INTO interests_table (interests) VALUES ('ENTREPRENEURSHIP');
INSERT INTO interests_table (interests) VALUES ('ART');
INSERT INTO interests_table (interests) VALUES ('LITERATURE');
INSERT INTO interests_table (interests) VALUES ('LOCAL_EVENTS');
INSERT INTO interests_table (interests) VALUES ('INVESTING');
INSERT INTO interests_table (interests) VALUES ('STARTING_A_BUSINESS');
INSERT INTO interests_table (interests) VALUES ('WOMEN_IN_TECH');
INSERT INTO interests_table (interests) VALUES ('BAME_IN_TECH');
INSERT INTO interests_table (interests) VALUES ('VETERANS_IN_TECH');
INSERT INTO interests_table (interests) VALUES ('BANKING_AND_FINANCE');
INSERT INTO interests_table (interests) VALUES ('MEDITATION_AND_SPIRITUALITY');
INSERT INTO interests_table (interests) VALUES ('PHOTOGRAPHY');


CREATE TABLE interests_mapper (


    interests_id INTEGER ,
    user_id INTEGER ,
    FOREIGN KEY (interests_id) REFERENCES interests_table (id),
    FOREIGN KEY (USER_id) REFERENCES users (id)

);



