package com.example.backEndProject.controller;

import com.example.backEndProject.repository.PostRepository;
import com.example.backEndProject.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostControllerTest {

    @Autowired
    private PostController postController;

    @Test
    void getAll() {
    }

    @Test
    void findPostByID() {
    }

    @Test
    void findLikesByID() {
    }

    @Test
    void searchPostsForKeyword() {
    }

    @Test
    void updateLikeCount() {
//        Why use the longer .getAll .get . getNumberOfLikes?
//        We don't want to test with our getWithId method in case we have problems
//        in the future


//        Given
        Long existingIdLong = 1L;
        int existingIdInt = 1;
        int current_likes = postController.getAll().get(existingIdInt).getNumber_of_likes();

//        When
        postController.updateLikeCount(existingIdLong);

//        Then
        assertEquals(current_likes, postController.getAll().get(existingIdInt).getNumber_of_likes());
    }

    @Test
    void superLikePost() {
    }

    @Test
    void editPost() {
    }

    @Test
    void deletePostById() {
    }

    @Test
    void deletePostByID() {
    }
}