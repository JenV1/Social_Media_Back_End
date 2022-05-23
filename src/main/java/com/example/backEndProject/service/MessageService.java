package com.example.backEndProject.service;

import com.example.backEndProject.model.Message;
import com.example.backEndProject.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {


//    DEPENDENCY INJECTION


    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


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


//    END OF METHODS
//
//
//    END OF FILE
}
