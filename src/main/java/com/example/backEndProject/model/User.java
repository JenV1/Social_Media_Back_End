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
    @GeneratedValue
    private Long id;
    private String name;
    private String company;
    private String interests;
    private String password;
    private String date_of_birth;

//    Relationship Mapping

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> allPostsByUser;


//    Constructors

    public User() {}

    public User(Long id, String name, String company, String interests, String password,
                String date_of_birth, ArrayList<Post> allPostsByUser) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.interests = interests;
        this.password = password;
        this.date_of_birth = date_of_birth;
        this.allPostsByUser = allPostsByUser;
    }


//    Getters and Setters


    public Long getId() {
        return id;
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

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
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

    public void setAllPostsByUser(ArrayList<Post> allPostsByUser) {
        this.allPostsByUser = allPostsByUser;
    }

//    Methods

}
