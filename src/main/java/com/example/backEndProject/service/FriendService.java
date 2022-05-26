package com.example.backEndProject.service;

import com.example.backEndProject.model.Friend;
import com.example.backEndProject.model.User;
import com.example.backEndProject.model.dto.UserDto;
import com.example.backEndProject.repository.FriendRepository;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendService {

    //    DEPENDENCIES INJECTIONS -- START

    @Autowired
    FriendRepository friendRepository;

    @Autowired
    UserRepository userRepository;


        public UserDto addFriend(String targetUser, String friendToAdd) {

            User userT = userRepository.findUserByName(targetUser);
            User userF = userRepository.findUserByName(friendToAdd);
            Friend friendLT = new Friend(userT.getId(), userT.getName(), userT.getCompany(), userT.getRole(), userT.getDate_of_birth(), userT.isBusinessAccount());
            Friend friendLF = new Friend(userF.getId(), userF.getName(), userF.getCompany(), userF.getRole(), userF.getDate_of_birth(), userF.isBusinessAccount());
            //creating two new Users - userT (the target user, who's list we want to update) and the userF (friend to be added)
            // create a friend, friendL, calling userF's getters
            friendRepository.save(friendLT);
            friendRepository.save(friendLF);
            //saving friendL to the repository, containing the data of the friend to add
            userT.setFriendList(friendLF);
            userF.setFriendList(friendLT);
            //setting the friend list of userT to the user info stored in friendL
            User updateUserT = userRepository.save(userT);
            User updateUserF = userRepository.save(userF);
            //saving the updated friendList of userT
            UserDto userDtoT = new UserDto(updateUserF.getId(), updateUserF.getName(), updateUserF.getCompany(), updateUserF.getRole(), updateUserF.getDate_of_birth(), updateUserF.isBusinessAccount());
            UserDto userDtoF = new UserDto(updateUserT.getId(), updateUserT.getName(), updateUserT.getCompany(), updateUserT.getRole(), updateUserT.getDate_of_birth(), updateUserT.isBusinessAccount());
            //user Dto object created to transfer the info over to friend repo
            friendRepository.addFriend(userDtoT.getCompany(), userDtoT.getDate_of_birth(), userDtoT.isBusinessAccount(), userDtoT.getName(), userDtoT.getRole());
            friendRepository.addFriend(userDtoF.getCompany(), userDtoF.getDate_of_birth(), userDtoF.isBusinessAccount(), userDtoF.getName(), userDtoF.getRole());
            return userDtoT;

        }


//            if (targetUser.equals(keyword)) {
//                return "Friend added to list... " + friendList.add(targetUser);
//            } else {
//                return "Friend already exists";
//            }

}



    //    DEPENDENCIES INJECTIONS -- END
//
//
    //    FRIENDS METHODS -- START



