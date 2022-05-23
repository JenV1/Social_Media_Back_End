package com.example.backEndProject.controller;

import com.example.backEndProject.service.CommentService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PutMapping("heartComment")
    public String heartComment(@RequestParam Long user_id,
                               @RequestParam String user_name,
                               @RequestParam String password,
                               @RequestParam Long postId
                               ){

        return commentService.heartComment(user_id,user_name,password,postId);




    }


}
