package com.example.backEndProject.controller;

import com.example.backEndProject.EntityManager.EMF;
import com.example.backEndProject.model.Comment;
import com.example.backEndProject.model.User;
import com.example.backEndProject.service.CommentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PutMapping("heartComment")
    public String heartComment(@RequestParam int user_id,
                               @RequestParam String user_name,
                               @RequestParam String password,
                               @RequestParam int postId
                               ){

        return commentService.heartComment(user_id,user_name,password,postId);




    }


}
