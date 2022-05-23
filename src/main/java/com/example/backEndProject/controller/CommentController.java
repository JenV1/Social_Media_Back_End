package com.example.backEndProject.controller;

import com.example.backEndProject.model.Comment;
import com.example.backEndProject.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping("findCommentById/{id}")
    public Comment findCommentByID(@PathVariable("id") Long id){

        return commentService.findCommentByID(id);

    }


    @PutMapping("heartComment")
    public String heartComment(@RequestParam Long user_id,
                               @RequestParam String user_name,
                               @RequestParam String password,
                               @RequestParam Long postId,
                               @RequestParam Long Id_of_comment_to_be_hearted
                               ){

        return commentService.heartComment(user_id,user_name,password,postId,Id_of_comment_to_be_hearted);




    }


}
