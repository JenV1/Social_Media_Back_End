package com.example.backEndProject.model;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content_text;
    private int number_of_likes;

//    Relationship Mapping

    @ManyToOne
    private User user;

//    Constructors

    public Post() {}

    public Post(Long id, String content_text, int number_of_likes) {
        this.id = id;
        this.content_text = content_text;
        this.number_of_likes = number_of_likes;
    }


//    Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent_text() {
        return content_text;
    }

    public void setContent_text(String content_text) {
        this.content_text = content_text;
    }

    public int getNumber_of_likes() {
        return number_of_likes;
    }

    public void setNumber_of_likes(int number_of_likes) {
        this.number_of_likes = number_of_likes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
