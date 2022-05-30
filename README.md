# CONNECT
An Informal Social Media App for networking and connecting professionals by their interests and aspirations.

## PROJECT VISION

Formal networks within organisations offer little room for emotions, feelings or sharing of personal thoughts. By relying on Connect, professionals can enjoy easy conversations and bond, without the pressures of conforming strictly to generic corporate culture. 

Connect aims to do this by creating a network of professionals, ready to support and bond with each other over common career interests. Connect will encourage users to attend networking events and socials with others on the site, allowing for relationships to strengthen and develop further. 

## ENTITY RELATIONSHIP DIAGRAM

![alt text](https://github.com/LMBroadhurst/backEndProjectGroup5/blob/main/ERD%20Final%20-%20BEP%20(2).jpg)
### Figure 1 - ERD diagram representing Connect's database

A Postgres database was used to store all information associated with Connect, such as user information, comments, posts, interests etc. **Figure 1** showcases how entities were related to one another in Connect's database. How each table relates to another is described in the following list:

### Users 
- Users to Comments : one to many
- Users to Posts : one to many 
- Users to Message : one to many
### Posts
- Posts to Comments : one to many 
- Posts to Post Types : one to one 
### Comments
- Comments to Replies : one to many 
### Mappers
- Users to Interest Mapper : one to one
- Interest Mapper to Interest Types : one to one 

As can be seen, most of the database extends out of two central tables, these tables being Users and Posts. Users have a many to many relationship to Interest Types, so, a mapper table is used to map a user to his/her particular interest(s).  