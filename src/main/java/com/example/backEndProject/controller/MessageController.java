package com.example.backEndProject.controller;

import com.example.backEndProject.model.Message;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.MessageRepository;
import com.example.backEndProject.repository.UserRepository;
import com.example.backEndProject.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MessageController {


//    Injection Dependency START

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    UserRepository userRepository;
    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

//    Injection Dependency END
//
//
//    MESSAGING FEATURES START

    @PostMapping("/sendMessageToUser")
    public Message sendMessageToUser(
                                     @RequestParam String message_content,
                                     @RequestParam String name_of_sender,
                                     @RequestParam String receiver_name) {

        return messageService.sendMessageToUser(message_content, name_of_sender, receiver_name);
    }

    @GetMapping("/checkUserInbox/{id}")
    public List<Message> getAllMessagesFromInbox(@PathVariable("id") Long id) {
        return messageService.getAllMessagesFromInbox(id);
    }

    @PutMapping("/editSentMessage/{message_id}")
    public Message editSentMessage(@RequestParam Long message_id,
                                   @RequestParam String newMessageContent
                                   ) {
        return messageService.editSentMessage(message_id, newMessageContent);
    }

    @DeleteMapping("/deleteASentMessage/{id}")
    public String deleteMessage(@PathVariable("id") Long id) {

        return messageService.deleteMessage(id);
    }

//    MESSAGING FEATURES END
//
//
//    FILE END

}
