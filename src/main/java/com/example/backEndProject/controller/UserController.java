package com.example.backEndProject.controller;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.UserRepository;
import com.example.backEndProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

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

    @PostMapping("/addNewUser")
    public String createUser(@RequestParam("username") String name,
                           @RequestParam("password") String password,
                           @RequestParam("date_of_birth") String dob,
                           @RequestParam("company") String company,
                           @RequestParam("role") String role,
                           @RequestParam("is_business_account?") Boolean isBusinessAccount
                           ){


       return userService.save(name,password,dob,company,role,isBusinessAccount);
    }

    @GetMapping("/searchForUserByName/{keyword}")
    public List<String> searchUsersForKeyword(@PathVariable("keyword") String keyword) {
        return userService.searchUsersForKeyword(keyword);
    }

//    MESSAGING METHODS

//    @GetMapping("/getAllMessagesFromInbox")
//    public List<String> getAllMessagesFromInbox() {
//        return userService.getAllMessagesFromInbox();
//    }


///    Put Methods


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

    @PutMapping("logUserIn")
    public String logUserIn(@RequestParam("username") String user_name,@RequestParam("password") String password){

        return userService.logUserIn(user_name,password);


    }


}
