package com.example.backEndProject.model;

import javax.persistence.*;

@Entity
public class Message {

//    ATTRIBUTES START


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message_content;
    private String nameOfSender;

    @ManyToOne
    private User user;


//    ATTRIBUTES END
//
//
//    CONSTRUCTORS START


    public Message() {
    }

    public Message(String message_content, String nameOfSender, User user) {
        this.message_content = message_content;
        this.nameOfSender = nameOfSender;
    }


//    CONSTRUCTORS END
//
//
//    Getters and setters START


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getNameOfSender() {
        return nameOfSender;
    }

    public void setNameOfSender(String nameOfSender) {
        this.nameOfSender = nameOfSender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


//    GETTERS AND SETTERS END
//
//
//    END OF FILE
}
