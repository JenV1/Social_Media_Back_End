package com.example.backEndProject.service;

import com.example.backEndProject.model.Comment;
import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.CommentRepository;
import com.example.backEndProject.repository.PostRepository;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.stereotype.Service;

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


    public Comment findCommentByID(Long id){

        return commentRepository.findCommentByID(id);

    }

    public String heartComment(Long user_id, String user_name, String password, Long postId, Long commentId){

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
            return "user does not exist";
        }

           return "Incorrect login details";


    }


}
