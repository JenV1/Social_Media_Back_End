package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
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

    //    Put Method

    @PutMapping("/user_like_a_post")
    public @ResponseBody String likePost(Long id) {

//        Find the number of likes on a current post
//        +1 the number of likes on post
//        !Check |user methods| for liking a post method!

//        user.likePost(post);

//        Update the data to reflect likes +1


        postService.getAll()
                .forEach(post -> {
                    if (post.getId().equals(id)) {
                        int updatedLikes = post.getNumber_of_likes() + 1;
                        post.setNumber_of_likes(updatedLikes);
                    }
                });

//        Response
        return "Like added";
    }

//    @GetMapping("/post_likes/{id}")
//    public int find_likes_of_post(@PathVariable("id") Long id){
//
////        Get the current post by ID
//        postService.getAll()
//                .forEach(post -> {
//                    if (post.getId().equals(id)) {
//                        return post.getNumber_of_likes();
//                    }
//                });
//
//
////        Return the number of likes
//        return post.getNumber_of_likes();
//    }

}
