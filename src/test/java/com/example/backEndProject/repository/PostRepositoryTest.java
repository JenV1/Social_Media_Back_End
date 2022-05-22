package com.example.backEndProject.repository;

import com.example.backEndProject.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;



    @Test
    void findPostByID() {
    }

    @Test
    public void
    deletePostByIDFromRepo() {
        Post post1 = new Post(1L, "hello", 11);
        Post post2 = new Post(2L, "si", 11);
        List<Post> posts = new List<Post>() {};
        postRepository.deletePostByID(post1.getId());
        assertThat(postRepository.count()).isEqualTo(1);
    }
}