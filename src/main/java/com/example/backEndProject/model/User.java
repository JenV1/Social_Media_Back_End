package com.example.backEndProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

//    Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String company;
    private String role;

    private String password;
    private String date_of_birth;

//    Inbox/Messages

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Message> inbox;

//    Relationship Mapping

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> allPostsByUser;

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> allCommentsByUser;



    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE", name = "is_business_account")
    private Boolean isBusinessAccount;


//    Constructors

    public User() {}


//    private final ArrayList<Post> adminPosts = new ArrayList<>();
////    @Transient
////    User admin = new User(999, "admin", "Connect", "password", "now", adminPosts);
//
////    public User getAdmin() {
////        return admin;
////    }


    public User(Long id, String name, String company, String role, String password,
                String date_of_birth, ArrayList<Post> allPostsByUser, Boolean isBusinessAccount) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.role = role;
        this.password = password;
        this.date_of_birth = date_of_birth;
        this.allPostsByUser = allPostsByUser;
        this.inbox = new ArrayList<Message>();
        this.isBusinessAccount = isBusinessAccount;
    }



//    Getters and Setters

    public Long getId() {
        return id;
    }

    public Boolean isBusinessAccount() {
        return isBusinessAccount;
    }

    public void setBusinessAccount(Boolean businessAccount) {
        isBusinessAccount = businessAccount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public List<Post> getAllPostsByUser() {
        return allPostsByUser;
    }

    public void setAllPostsByUser(List<Post> allPostsByUser) {
        this.allPostsByUser = allPostsByUser;
    }

    public List<Message> getInbox() {
        return inbox;
    }

    public void setInbox(List<Message> inbox) {
        this.inbox = inbox;
    }

    //    Methods

//    Adding this to Post, simply add like to post to begin

    public void likePost(Post post) {
        int newLikeTotal = post.getNumber_of_likes() + 1;
        post.setNumber_of_likes(newLikeTotal);
    }

}
