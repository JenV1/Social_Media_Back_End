package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

//    Mapping Methods

    @GetMapping("/list_all_users")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/users_postgres")
    public String listAll(Model model) {
        List<User> listUsers = userService.getAll();
        model.addAttribute("listUsers", listUsers);

        return "students";
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        User savedUser = userService.save(user);
    }

///    Put Method
//
//    @PutMapping("/user_like_a_post")
//    public @ResponseBody String likePost(User user, Post post) {
//
////        Find the number of likes on a current post
////        +1 the number of likes on post
////        !Check |user methods| for liking a post method!
//
//        user.likePost(post);
//
////        Update the data to reflect likes +1
//
//        postService
//
////        Response
//        return "Like added";
//    }

}
