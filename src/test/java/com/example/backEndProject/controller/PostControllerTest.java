package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PostControllerTest {

    @Autowired
    //Methods to test endpoints
    private MockMvc mockMvc;
//    @Autowired
    //methods to map json <-> java
    private ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private PostRepository postRepository;


    //    @PostMapping("/addNewPost")
//    public Post addPost(@RequestParam(required = false) Long id,
//                        @RequestParam String content_text,
//                        @RequestParam(required = false) boolean isBusinessAccount,
//                        @RequestParam(required = true) Integer post_type_id,
//                        @RequestParam(required = true) Long user_id) throws IOException {
//
//        return postService.addPost(id, content_text, 0, isBusinessAccount, post_type_id, user_id);
////    @DeleteMapping("/deletePost/{id}")
////    public String deletePostByID(@PathVariable("post_id") Long id) {
////        return postService.deletePostByID(id);
////    }
//    }
    @Test
    void shouldAddNewPost() throws Exception {
        // Given
        assertEquals(55, postRepository.findAll().size());
        // When
        MvcResult mvcResult = mockMvc
                .perform(
                        MockMvcRequestBuilders.post("/addNewPost")
//                                .param("id", "null")
                                .param("content_text", "I love coding")
                                .param("isBusinessAccount", "false")
                                .param("post_type_id", "1")
                                .param("user_id", "1")
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        // Then
        String postInJsonFormat = mvcResult.getResponse().getContentAsString();
        Post post = objectMapper.readValue(postInJsonFormat, Post.class);

        assertEquals(56, postRepository.findAll().size());
        assertEquals(56L, post.getId());
        assertEquals("I love coding", post.getContent_text());
        assertEquals(false, post.getBusinessAccount());
        assertEquals(1, post.getPost_types_id());
//        assertEquals(1L, post.getUser().getId());
    }
}
