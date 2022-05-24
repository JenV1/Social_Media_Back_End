package com.example.backEndProject.service;

import com.example.backEndProject.model.Message;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.MessageRepository;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
                                     String receiver_name) {


        String finalReceiver_name = receiver_name.toLowerCase();
        User receiver = userRepository.findAll().stream()
                .filter(recipient -> (finalReceiver_name).equals(recipient.getName().toLowerCase()))
                .findFirst()
                .orElse(null);


        Message newMessage = null;

        newMessage = new Message(message_content, name_of_sender, receiver);


        receiver.getInbox().add(newMessage);
        newMessage.setUser(receiver);


        return messageRepository.save(newMessage);
    }




    public List<Message> getAllMessagesFromInbox(Long id) {
        return userRepository.findByID(id).getInbox();
    }

    public Message editSentMessage(Long message_id,
                                   String newMessageContent) {

        Message editedMessage = messageRepository.findById(message_id).get();
        editedMessage.setMessage_content(newMessageContent);

        return messageRepository.save(editedMessage);
    }

    public String deleteMessage(Long id) {
        String outputMessage = "Successfully deleted message with id: " + id;

        try {
            messageRepository.deleteById(id);
        } catch (Exception e) {
            outputMessage = "Could not find message id";
        }

        return outputMessage;
    }


//    END OF METHODS
//
//
//    END OF FILE
}
