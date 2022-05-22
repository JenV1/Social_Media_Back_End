package com.example.backEndProject.service;

import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(Long id){
        return userRepository.findByID(id);
    }

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

}
