package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.PostRepository;
import com.example.backEndProject.service.PostService;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@RestController
public class PostController {

    private PostRepository postRepository;
    private PostService postService;

    public PostController(PostRepository postRepository){
        this.postRepository = postRepository;
    }

//    Get Mapping Methods

    @GetMapping("/list_all_posts")
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @GetMapping("/post/{id}")
    public Post findPostByID(@PathVariable("id") Long id){
        return findPostByID(id);
    }

    @GetMapping("/numberOfLikesOnPost/{id}")
    public int findLikesByID(@PathVariable("id") Long id) {

//        Inspired by the way likes are shown on posts on social media applications

        Post current = null;
        try {
            current = postRepository.findById(id).get();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current.getNumber_of_likes();
    }


    //    Put Mapping Methods

    @PutMapping("/addLikeToPost/{id}")
    public Post updateLikeCount(@PathVariable("id") Long id) throws NoSuchElementException {

//        Adds like to specific post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outide of try catch to ensure it was within scope for the return statement.

        Post current = null;
        try {
            current = postRepository.findById(id).get();
            current.setNumber_of_likes(current.getNumber_of_likes() + 1);
            postRepository.save(current);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }

    @PutMapping("/editOldPost/{id}")
    public Post editPost(@PathVariable("id") Long id,
                         @RequestBody String new_content) throws NoSuchElementException {

//        Edits already established post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        Post current = null;
        try {
            current = postRepository.findById(id).get();
            current.setContent_text(new_content);
            postRepository.save(current);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }


}
