package com.example.backEndProject.controller;

import com.example.backEndProject.service.MessageService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

}
