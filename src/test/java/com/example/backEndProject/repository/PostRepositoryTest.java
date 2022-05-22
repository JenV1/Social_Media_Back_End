package com.example.backEndProject.repository;

import com.example.backEndProject.model.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    Post post1;
    Post post2;
    List<Post> posts;

    @Test
    void findPostByID() {


    }

    @Test
    public void
    deletePostByIDFromRepo() {
        postRepository.deletePostByID(post1.getId());
        assertThat(postRepository.count()).isEqualTo(1);
    }
}