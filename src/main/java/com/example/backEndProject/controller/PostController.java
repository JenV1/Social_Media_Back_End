package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PostController {


    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

//    Get Mapping Methods

    @GetMapping("/list_all_posts")
    public List<Post> getAll() {
        return postService.getAll();
    }

    @GetMapping("/post/{id}")
    public Post findPostByID(@PathVariable("id") Long id) {
        return postService.findPostByID(id);
    }

    @GetMapping("/numberOfLikesOnPost/{id}")
    public int findLikesByID(@PathVariable("id") Long id) {
        return postService.findLikesByID(id);
    }

    @GetMapping("/searchForKeyword/{keyword}")
    public List searchPostsForKeyword(@PathVariable("keyword") String keyword) {
        return postService.searchPostsForKeyword(keyword);
    }

    @GetMapping("/searchAllBusinessAccountPosts/{is_business_account}")
    public List searchAllBusinessAccountPosts(@PathVariable("is_business_account") boolean isBusinessAccount) {
        return postService.searchAllBusinessAccountPosts(isBusinessAccount);
    }

//    @GetMapping("/searchAllBusinessAccountPosts/{post_type_id}")
//    public List search



//    Put Methods

    @PutMapping("/addLikeToPost/{id}")
    public Post updateLikeCount(@PathVariable("id") Long id) throws NoSuchElementException {

        return postService.updateLikeCount(id);
    }

    @PutMapping("/addSuperlikeToPost/{id}")
    public Post superLikePost(@PathVariable("id") Long id) throws NoSuchElementException {

        return postService.superLikePost(id);
    }

    @PutMapping("/editOldPost/{id}")
    public Post editPost(@RequestBody String new_content, @PathVariable("id") Long id)
            throws NoSuchElementException, IOException {
        return postService.editPost(id, new_content);
    }

    @PostMapping("/addNewPost")
    public void addPost(@RequestParam Long id,
                        @RequestParam String content_text,
                        @RequestParam int number_of_likes,
                        @RequestParam(required = false) boolean isBusinessAccount){

        postService.addPost(id, content_text, number_of_likes, isBusinessAccount);
    }



    @DeleteMapping("/post/{id}")
    public ResponseEntity<Long> deletePostById(@PathVariable(value = "id") Long id) {
        postService.deletePostByID(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @DeleteMapping("/deletePost/{id}")
    public String deletePostByID(@PathVariable("post_id") Long id) {
        return postService.deletePostByID(id);
    }
}

