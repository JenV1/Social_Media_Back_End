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

    id SERIAL,
    interests interests_career
);

INSERT INTO interests_table (interests) VALUES ('AI');