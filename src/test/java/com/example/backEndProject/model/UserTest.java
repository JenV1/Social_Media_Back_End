package com.example.backEndProject.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void likePost() {
//        Given
        ArrayList<Post> testUserPosts = new ArrayList<>();
        User testUser = new User(1L, "Lewis", "BNTA", Interests.BACK_END_DEVELOPMENT,
                "Password1", "1994", testUserPosts);

        Post testPost = new Post(1L, "Wow, I love coding with Java!", 4);

//        When

        testUser.likePost(testPost);

//        Then
        assertEquals(5, testPost.getNumber_of_likes());
    }
}