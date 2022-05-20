package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

//    Mapping Methods

    @GetMapping("/list_all_posts")
    public List<Post> getAll() {
        return postService.getAll();
    }
}
