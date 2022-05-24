package com.example.backEndProject.service;

import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService {


//    DEPENDENCY INJECTION


    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


//    DEPENDENCY INJECTION END
//
//
//    SERVICE METHODS START


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
//        Uses to lower case to ensure no name is missed
//        Filter with lambda is dependent on whether name contains the specified keyword
//        Returns list of posts

        List<String> foundUsers = userRepository.findAll().stream()
                .map(user -> user.getName().toLowerCase())
                .filter(s -> s.contains(keyword.toLowerCase()))
                .toList();

        if (foundUsers.isEmpty()) {
            ArrayList<String> noMatches = new ArrayList<>();
            noMatches.add("No users found :(");
            return noMatches;
        }

        return foundUsers;
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


//    END OF METHODS
//
//
//    MESSAGING METHODS


//    public List<String> getAllMessagesFromInbox() {
//        return userRepository.findByID(1L).getInbox();
//    }


//    END OF MESSAGING METHODS
//
//
//    END OF FILE
}
