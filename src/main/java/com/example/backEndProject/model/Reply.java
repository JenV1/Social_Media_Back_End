package com.example.backEndProject.model;

import javax.persistence.*;

@Entity
@Table(name = "replies")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reply;
}
