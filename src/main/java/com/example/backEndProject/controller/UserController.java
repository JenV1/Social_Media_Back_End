package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.UserRepository;
import com.example.backEndProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class UserController {


//    INJECTION DEPENDENCY START


    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


//    INJECTION DEPENDENCY START
//
//
//    GET Mapping Methods


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


    @GetMapping("/searchForUserByName/{keyword}")
    public List<String> searchUsersForKeyword(@PathVariable("keyword") String keyword) {
        return userService.searchUsersForKeyword(keyword);
    }


//    GET METHODS END
//
//
//    Put Methods START


    @PutMapping("/editName/{id}")
    public User editName(@PathVariable("id") Long id,
                         @RequestBody String new_name){

        return userService.editName(id, new_name);
    }


    @PutMapping("/editCompany/{id}")
    public User editCompany(@PathVariable("id") Long id,
                         @RequestBody String new_company) {

        return userService.editCompany(id, new_company);
    }

    @PutMapping("/editPassword/{id}")
    public User editPassword(@PathVariable("id") Long id,
                            @RequestBody String new_password)
                            throws NoSuchElementException {

        return userService.editPassword(id, new_password);

    }

    @PutMapping("/editDOB/{id}")
    public User editDOB(@PathVariable("id") Long id,
                             @RequestBody String new_DOB)
            throws NoSuchElementException {

        return userService.editDOB(id, new_DOB);

    }


//    Put Methods END
//
//
//    POST METHODS START


    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        User savedUser = userService.save(user);
    }

    @PostMapping("/addUsers")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.save(user);

        return new ResponseEntity< >(newUser, HttpStatus.CREATED);
    }


//    Put Methods END
//
//
//    POST METHODS START


//    MESSAGING METHODS

//    @GetMapping("/getAllMessagesFromInbox")
//    public List<String> getAllMessagesFromInbox() {
//        return userService.getAllMessagesFromInbox();
//    }
}
