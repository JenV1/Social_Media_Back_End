package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class UserController {


    private UserRepository userRepository;

//    private UserService userService;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
//    public UserController(UserService userService) {this.userService = userService;}

//    Mapping Methods

    @GetMapping("/list_all_users")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/users_postgres")
    public String listAll(Model model) {
        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);

        return "students";
    }

    @GetMapping("/users/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        User savedUser = userRepository.save(user);
    }

    @GetMapping("/searchForUserByName/{keyword}")
    public Set<String> searchUsersForKeyword(@PathVariable("keyword") String keyword) {

//        Gets all users and converts to a stream
//        Extracts the name from each user and maps them
//        Filters name dependent on whether they contain the specified keyword
//        Returns list of posts

        Set<String> foundUsers = userRepository.findAll().stream()
                .map(User::getName)
                .filter(s -> s.contains(keyword))
                .collect(Collectors.toSet());

        if (foundUsers.isEmpty()) {
            foundUsers.add("No users found :(");
        }

        return foundUsers;


    }

///    Put Methods

    @PutMapping("/editName/{id}")
    public User editName(@PathVariable("id") Long id,
                         @RequestBody String new_name) throws NoSuchElementException {

//        Edits already established post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        User current = null;
        try {
            current = userRepository.findById(id).get();
            current.setName(new_name);
            userRepository.save(current);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }

    @PutMapping("/editCompany/{id}")
    public User editCompany(@PathVariable("id") Long id,
                         @RequestBody String new_company) throws NoSuchElementException {

//        Edits already established post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        User current = null;
        try {
            current = userRepository.findById(id).get();
            current.setCompany(new_company);
            userRepository.save(current);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }

    @PutMapping("/editPassword/{id}")
    public User editPassword(@PathVariable("id") Long id,
                            @RequestBody String new_password) throws NoSuchElementException {

//        Edits already established post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        User current = null;
        try {
            current = userRepository.findById(id).get();
            current.setPassword(new_password);
            userRepository.save(current);


        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }




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
