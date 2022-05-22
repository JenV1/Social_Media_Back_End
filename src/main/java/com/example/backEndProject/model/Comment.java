package com.example.backEndProject.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_of_likes")
    private int likes;

    private Boolean heartByUser;


    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;

    public Comment() {
    }

    public Comment(Long id, int likes, Boolean heartByUser, String replies) {
        this.id = id;
        this.likes = likes;
        this.heartByUser = heartByUser;

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

    public Boolean getHeartByUser() {
        return heartByUser;
    }

    public void setHeartByUser(Boolean heartByUser) {
        this.heartByUser = heartByUser;
    }
}
