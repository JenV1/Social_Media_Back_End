package com.example.backEndProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "interest_types")
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private InterestsEnum interests;

    @ManyToMany(mappedBy = "interests")
    private List<User> users;

    public Interest() {
    }

    public Interest(Long id) {
        this.id = id;
    }
}
