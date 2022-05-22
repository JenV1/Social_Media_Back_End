package com.example.backEndProject.model;


import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_of_likes")
    private int likes;

    private String heartByUser;

    private String replies;

    public Comment() {
    }

    public Comment(Long id, int likes, String heartByUser, String replies) {
        this.id = id;
        this.likes = likes;
        this.heartByUser = heartByUser;
        this.replies = replies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getHeartByUser() {
        return heartByUser;
    }

    public void setHeartByUser(String heartByUser) {
        this.heartByUser = heartByUser;
    }
}
