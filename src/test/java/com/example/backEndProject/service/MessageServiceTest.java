package com.example.backEndProject.service;

import com.example.backEndProject.controller.MessageController;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.MessageRepository;
import com.example.backEndProject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageServiceTest {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    MessageController messageController;

    @Autowired
    UserRepository userRepository;

    @Test
    void sendMessageToUser__test__receiver() {
////        Given
//        String message_content = "Test message";
//        String name_of_sender = "Lewis";
//        String password_of_sender = "koolkode";
//        String receiver_name = "Scott";
//
////       When
//        messageController.sendMessageToUser(message_content, name_of_sender, password_of_sender, receiver_name);
//
//        String finalReceiver_name = receiver_name.toLowerCase();
//        User receiver = userRepository.findAll().stream()
//                .filter(recipient -> (finalReceiver_name).equals(recipient.getName().toLowerCase()))
//                .findFirst()
//                .orElse(null);
//
////       Then
//
//        assertEquals(2, receiver.getInbox().size());
    }

    @Test
    void getAllMessagesFromInbox__test() {
    }

    @Test
    void editSentMessage__test() {
    }

    @Test
    void deleteMessage__test() {
    }
}