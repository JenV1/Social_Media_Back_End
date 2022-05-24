package com.example.backEndProject.service;

import com.example.backEndProject.model.Comment;
import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.CommentRepository;
import com.example.backEndProject.repository.PostRepository;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentService {

    private UserRepository userRepository;
    private PostRepository postRepository;

    private CommentRepository commentRepository;

    public CommentService(UserRepository userRepository, PostRepository postRepository,
                           CommentRepository commentRepository){

        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;

    }

    public Map<String,String> showAllComments(){


        Map<String,String> result = new HashMap<>();
        List<Post> posts = commentRepository.findAll().stream().map(comment -> comment.getPost()).toList();
        List<Comment> comments = commentRepository.findAll();

        for(int i = 0; i < posts.size(); i++){

            Post currentPostInForLoop = posts.get(i);
            List<Comment> commentsCorrespondingToCurrentPost = comments.stream().filter(comment -> comment
                    .getPost().getId() == currentPostInForLoop.getId()).toList();

            List<String> commentContent = commentsCorrespondingToCurrentPost.stream().map(comment -> comment.getCommentContent()).toList();

            result.put("POST: " + currentPostInForLoop.getContent_text() + " || POSTED BY: " + currentPostInForLoop.getUser().getName()
                    + " || LIKES: " + currentPostInForLoop.getNumber_of_likes(),"COMMENTS(S): "
                    + commentContent);
        }

        return result;
    }


    public String findCommentByID(Long id){

        Comment resultComment =  commentRepository.findCommentByID(id);


        return "COMMENT ID: " + resultComment.getId()
                + " || COMMENT CONTENT: " + resultComment.getCommentContent()
                + " || LIKES: " + resultComment.getLikes()
                + " || POST: " + resultComment.getPost().getContent_text();


    }

    public String heartComment(Long user_id,  Long postId,String user_name, String password, Long commentId){

        try{
            User result_user = userRepository.findByID(user_id);
            Post result_post = postRepository.findPostByID(postId);
            Comment result_comment = commentRepository.findCommentByID(commentId);


            if(result_user.getName().equals(user_name)
                    && result_user.getPassword().equals(password)
                    && result_post.getUser().getId().equals(user_id)
                    && result_comment.getPost().getId().equals(postId)){

                result_comment.setHeartByUser(Boolean.TRUE);
                commentRepository.save(result_comment);



                return "hearted";


            }

        }catch(NullPointerException e){
            return "user/post does not exist";
        }

           return "Incorrect login details";


    }

    public void addComment(

                             Long post_id,
                             Long user_id,
                             String commentContent){


        commentRepository.addComment(post_id,user_id,commentContent);


    }

    public void deleteCommentById(Long id){

        commentRepository.deleteById(id);

    }

    public void changeCommentContent(String commentContent,Long id){

        Comment resultComment = commentRepository.findCommentByID(id);

        resultComment.setCommentContent(commentContent);

        commentRepository.save(resultComment);
    }



}
