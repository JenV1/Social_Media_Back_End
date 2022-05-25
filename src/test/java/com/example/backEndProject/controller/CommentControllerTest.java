package com.example.backEndProject.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class CommentControllerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void showAllCommentsWorksThroughAllLayers() throws Exception{


        Map<String,String> result = new HashMap<>();
        result.put("No comments to show","try posting a comment");

        MvcResult mvcResult = this.mockMvc.perform(get("/showAllComments"))
                .andExpect(status().isOk())
                // some extra logging
                .andDo(print())
                .andReturn();

        String contentAsString = mvcResult.getResponse().getContentAsString();

        // map JSON to java
        Map<String, String> mapFromJSON = objectMapper.readValue(contentAsString, new TypeReference<HashMap<String,String>>() {});

        assertNotNull(mapFromJSON.get("No comments to show"));

    }

    @Test
    void findCommentByID() {
    }

    @Test
    void heartComment() {
    }

    @Test
    void changeCommentContent() {
    }

    @Test
    void addComment() {
    }

    @Test
    void deleteCommentById() {
    }
}