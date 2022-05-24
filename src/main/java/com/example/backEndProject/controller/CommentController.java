package com.example.backEndProject.controller;

import com.example.backEndProject.model.Comment;
import com.example.backEndProject.model.Post;
import com.example.backEndProject.service.CommentService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }


    @GetMapping("showAllComments")
    public Map<String,String> showAllComments(){



        return commentService.showAllComments();

    }




    @GetMapping("findCommentById/{id}")
    public String findCommentByID(@PathVariable("id") Long id){

        return commentService.findCommentByID(id);

    }


    @PutMapping("heartComment")
    public String heartComment(@RequestParam("userID_of_person_that_created_post") Long user_id,
                               @RequestParam("userName") String user_name,
                               @RequestParam("password") String password,
                               @RequestParam("postID") Long postId,
                               @RequestParam("ID_of_comment_to_be_hearted") Long Id_of_comment_to_be_hearted
                               ){

        return commentService.heartComment(user_id,user_name,password,postId,Id_of_comment_to_be_hearted);




    }

    @PutMapping("changeCommentContent/{id}")
    public String changeCommentContent(@RequestParam String change_comment_content_to,
            @PathVariable("id") Long id){

        try{
            commentService.changeCommentContent(change_comment_content_to,id);
        }catch(NullPointerException e){

            return "This comment does not exist";
        }

        return "Comment successfully updated";


    }




    @PostMapping("postComment")
    public void addComment(@RequestParam("postID") Long post_id,
                             @RequestParam("userID") Long user_id,
                             @RequestParam("content") String commentContent){

        commentService.addComment(post_id,user_id,commentContent);
    }

    @DeleteMapping("deleteCommentById/{id}")
    public String deleteCommentById(@PathVariable("id") Long id){

        try{
            commentService.deleteCommentById(id);
        }catch(EmptyResultDataAccessException e){
            return "This comment doesn't exist";
        }


        return "Comment Deleted";
    }

}
