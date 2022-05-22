package com.example.backEndProject.service;

import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.NoSuchElementException;
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

    public List<String> searchUsersForKeyword(String keyword) {

//        Gets all users and converts to a stream
//        Extracts the name from each user and maps them
//        Filters name dependent on whether they contain the specified keyword
//        Returns list of posts

        return userRepository.findAll().stream()
                .map(User::getName)
                .filter(s -> s.contains(keyword))
                .toList();

    }

    public User editName(Long id, String new_name)
            throws NoSuchElementException {

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

    public User editCompany(Long id, String new_company)
            throws NoSuchElementException {

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

    public User editPassword(Long id, String new_password)
            throws NoSuchElementException {

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

    public User editDOB(Long id, String new_DOB)
            throws NoSuchElementException {

//        Edits already established post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        User current = null;
        try {
            current = userRepository.findById(id).get();
            current.setDate_of_birth(new_DOB);
            userRepository.save(current);


        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }

}
