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


INSERT INTO users (company,date_of_birth,name,password) VALUES
('Peppermint','1999','Cem','password');

INSERT INTO posts (content_text,number_of_likes,post_types_id,user_id) VALUES
('hello','1',3,1);

--INSERT INTO posts (content_text,number_of_likes,post_types_id,user_id) VALUES
--('hello','1',3,1);
--INSERT INTO interests_mapper (interests_id,user_id) VALUES (9,1);


--users here

INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA','Software Engineer','Wednesday','Jem','password');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA','Software Engineer','13/09/1998', 'Scott', 'chickenfella');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA', 'Software Engineer','11/07/1864', 'Lewis', 'koolkode');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('BNTA', 'Software Engineer','23/01/2004', 'Mohamed', 'CLIlover');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('GOD', 'Son of God','25/12/6BC', 'Jesus', 'holy');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Hells Kitchen','Head Chef','08/11/1966', 'Gordon Ramsey', 'lambsauce');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('PSG','Sporting Director/Owner/Football Player','10/12/1998', 'Kylian Mbappe', 'money');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Bloggs Inc.','Blogger','tomorrow','Joe Bloggs','blogg');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Liverpool FC','Football player','01/01/156AD', 'James Milner', 'ribena');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Tegrity','Hemp Farmer','05/04/1977', 'Randy Marsh', 'theytookourjobs');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Atos','Recruiter','05/04/1990', 'Brilliant', 'theseGuysKnowTheirStuff');
INSERT INTO users (company,role,date_of_birth,name,password)
VALUES ('Lloyds','Recruiter','05/07/1990', 'Amazing', 'iAgreeAtos, TheseGuysKnowTheirStuff');


-- posts here
INSERT INTO posts (content_text, is_business_account, number_of_likes, post_types_id, user_id) VALUES ('Damn, Pingu inspires to be a better person everyday', True, 55, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('wow. the most aMAzing fillet mignon, lathered in THE most incredible peppercorn sauce. THAT is food!', 10230, 3, 2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('delighted to be partaking in the BNTA back-end API project. Excited to work with some of the biggest names in the business on this!', 203400, 3, 3);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('yesterday i missed an interview to feed a dog. the next day i got a call. it was the interviwer offering me the job. i walked in on my first day and met my new boss. it was the dog.', 1856, 3, 4);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Loving the BNTA back-end API project. Any company would be stupid to not hire these 4 cool dudes', 1420782, 3, 5);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Filling out a database can be monotonous. Thats why its fun to be creative! Adding users with a personality makes it worthwhile.', 1, 3, 2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('The following thread is a true story; an experience that has, and will continue to change my life forever...', 80, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(1) Yesterday, i was heading for an interview, when i came across a starving dog. I knew, in that moment, it was more important to help the dog...', 56, 3, 10);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(2) ... So I fed the dog, bathed and clothed it. Found a rescue centre nearby. Of course, I missed the interview, but I was confident I did the right thing, despite missing out on my dream job.', 34, 3, 10);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(3) ... But the next day, a funny thing happened. The office called me and I told them what happened. They asked me if I would like to come down to the office that day, so I did... ', 47, 3, 10);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(4) ... I was called into the boardroom after waiting nervously for some time. Then I saw the interviewer. It was the dog.', 754, 3, 10);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Thanks for all the birthday messages! Havent been on this account in months!', 100, 3, 9);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Wow. Java is literally great.', 25, 3, 3);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Wow. Seriously? Wow. No come on. The post is RAWWWW!', 1000, 3, 6);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('𝐍𝐨𝐭𝐫𝐞 𝐡𝐢𝐬𝐭𝐨𝐢𝐫𝐞 𝐬’𝐞́𝐜𝐫𝐢𝐭 𝐢𝐜𝐢. 𝐈𝐜𝐢 𝐜’𝐞𝐬𝐭 𝐏𝐚𝐫𝐢𝐬 (et l argent hehe!)', 200000, 3, 7);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Hope you enjoyed my hat-trick last night!!!', 1000000, 3, 7);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('I am making a series of 4 reasons on why software engineering is THE industry to break into right now, and for the future!', 50, 1, 8);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(1) The industry is growing... big time! With the U.S. Software Engineering market expected to grow to $44.54bn by 2025 (CAGR 7.2%), there should be plenty of upcoming opportunities for keen coders!', 70, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(2) Autonomy! You have the freedom and opportunity to innovate and create using new technologies in lots of different projects. But remember - With great power, comes great responsibility... Dont create an Ultron!', 87, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(3) Professional Development! There are plenty of opportunities to learn new programming languages in a continually changing, dynamic industry environment. Whats not to like?', 100, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('(4) Collaboration! Having the opportunity to work with an interesting and diverse set of individuals, all with different intellectual curiosities for the subject, makes SE a fantastic choice to build a career!', 101, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Hope you all enjoyed this thread! Dont forget to absolutely obliterate that like button and subscribe!', 89, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Just seen a new ribena has been released. Ecstatic.', 100000, 3, 9);

INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Do love a bit of Java on a Sunday morning! Coffee = essential', 1, 3, 3);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('I am the king of postgres, bow down to me or I will put you in a table', 1262, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Java, SQL, DeleteMapping, the holy trinity of big scotty', 1021, 3, 2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Im posting more than the postman, I am PostMapping', 8911, 3, 4);

INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Theres a reason why Java has the symbol as a coffee...', 1053236, 3, 3);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('As King SQL, I must be head of the round table', 5043, 3, 1);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Spring is honestly so rewarding!', 52, 3, 2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Our Spring project is definitely going to be the best in 5B!', 8911, 3, 4);

INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Catch the new Hells Kitchen episode and laugh at our resident idiot sandwiches', 2513236, 1, 6);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Its always the bloody lamb sauce...', 99033343, 1, 6);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Spring is honestly so rewarding!', 52, 3, 2);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Our Spring project is definitely going to be the best in 5B!', 8911, 3, 4);

INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Hosting an even on Friday for Cohort 5B to show us what they are made of!', 236, 2, 11);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Cant believe how good these guys are! Java - Spring - SQL - They have it all', 6522, 2, 11);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Why have they put Atos first in the table? Still impressed though', 252, 3, 12);
INSERT INTO posts (content_text,number_of_likes, post_types_id, user_id) VALUES ('Hosting a fundraiser for Ukraine this weekend!', 71143, 4, 12);


INSERT INTO message (message_content, name_of_sender, user_id) VALUES ('This is a test message!', 'Lewis', 3);

INSERT INTO message (message_content, name_of_sender, user_id) VALUES ('Letsss gooooooo', 'Mohamed', 5);
INSERT INTO message (message_content, name_of_sender, user_id) VALUES ('Projects going great so far, loving this messaging service', 'Scott', 3);
INSERT INTO message (message_content, name_of_sender, user_id) VALUES ('Wow, Connect is such a good social media app!', 'Cem', 2);

