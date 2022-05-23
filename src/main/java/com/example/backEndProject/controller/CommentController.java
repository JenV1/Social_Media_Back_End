package com.example.backEndProject.controller;

import com.example.backEndProject.model.Comment;
import com.example.backEndProject.service.CommentService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

//    INJECTION MAPPING START

    private CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }


//    INJECTION MAPPING END
//
//
//    GET MAPPING START


    @GetMapping("showAllComments")
    public List<Comment> showAllComments(){
        return commentService.showAllComments();

    }


    @GetMapping("findCommentById/{id}")
    public Comment findCommentByID(@PathVariable("id") Long id){

        return commentService.findCommentByID(id);

    }


//    GET MAPPING END
//
//
//    PUT MAPPING START


    @PutMapping("heartComment")
    public String heartComment(@RequestParam Long user_id,
                               @RequestParam String user_name,
                               @RequestParam String password,
                               @RequestParam Long postId,
                               @RequestParam Long Id_of_comment_to_be_hearted
                               ){

        return commentService.heartComment(user_id,user_name,password,postId,Id_of_comment_to_be_hearted);

    }


    @PutMapping("changeCommentContent/{id}")
    public String changeCommentContent(@RequestParam String change_comment_content_to,
            @PathVariable("id") Long id){

        try{
            commentService.changeCommentContent(change_comment_content_to,id);
        } catch(NullPointerException e) {

            return "This comment does not exist";
        }

        return "Comment successfully updated";

    }

//    PUT MAPPING END
//
//
//    POST MAPPING START


    @PostMapping("postComment")
    public void addComment(@RequestParam Long post_id,
                             @RequestParam Long user_id,
                             @RequestParam String commentContent){

        commentService.addComment(post_id,user_id,commentContent);
    }


//    POST MAPPING END
//
//
//    DELETE MAPPING START


    @DeleteMapping("deleteCommentById/{id}")
    public String deleteCommentById(@PathVariable("id") Long id){

        try{
            commentService.deleteCommentById(id);
        }catch(EmptyResultDataAccessException e){
            return "This comment doesn't exist";
        }


        return "Comment Deleted";
    }


//    DELETE MAPPING END
//
//
//    END OF FILE


}
