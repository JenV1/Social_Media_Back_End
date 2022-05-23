package com.example.backEndProject.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostRepositoryTest {

    private PostRepository postRepository;



    @Test
    void findPostByID() {
    }

//   @Test
//    void deletePostById() {
//        ArrayList<String> postList = new ArrayList<>();
//        Post post1 = new Post(1L, "this is a post", 10);
//        Post post2 = new Post(2L, "this is a post", 9);
//        postList.add(1, post1);
//        postList.add(2, post2);
//        postRepository.deletePostByID(post1.getId());
//        assertThat(postRepository.count()).isEqualTo(1);
}