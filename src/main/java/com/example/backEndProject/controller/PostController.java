package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {


    private PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

//    Mapping Methods

    @GetMapping("/list_all_posts")
    public List<Post> getAll() {
        return postService.getAll();
    }

    @GetMapping("/post/{id}")
    public Post findPostByID(@PathVariable("id") Long id){
        return findPostByID(id);
    }



}
