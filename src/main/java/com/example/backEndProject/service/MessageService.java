package com.example.backEndProject.service;

import com.example.backEndProject.model.Message;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.MessageRepository;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {


//    DEPENDENCY INJECTION


    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Autowired
    private UserRepository userRepository;



//    END OF DEPENDENCY INJECTION
//
//
//    START OF METHODS


    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    public Message save(Message message) {
        return messageRepository.save(message);
    }

    public Message sendMessageToUser(String message_content,
                                     String name_of_sender,
                                     Long receiver_id) {

        User receiver = userRepository.findByID(receiver_id);

        Message newMessage = new Message(message_content, name_of_sender, receiver);

        receiver.getInbox().add(newMessage);
        newMessage.setUser(userRepository.findByID(receiver_id));


        return messageRepository.save(newMessage);
    }


//    END OF METHODS
//
//
//    END OF FILE
}
