package com.example.backEndProject.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,columnDefinition = "INTEGER DEFAULT 0")
    private int likes;

    @Column(nullable=false, columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean heartByUser;

    private String commentContent;


    @ManyToOne
    private Post post;

    @ManyToOne
    @JoinColumn(name = "commenter_UserID")
    private User user;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"comment"})
    private List<Reply> commentReplies;


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

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
