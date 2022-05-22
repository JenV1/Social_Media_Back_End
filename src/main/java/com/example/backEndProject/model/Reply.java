package com.example.backEndProject.model;

import javax.persistence.*;

@Entity
@Table(name = "replies")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reply;

    private int numberOfLikes;

    @ManyToOne
    private Comment comment;

    public Reply() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Reply(Long id, String reply) {


        this.id = id;
        this.reply = reply;
    }
}
