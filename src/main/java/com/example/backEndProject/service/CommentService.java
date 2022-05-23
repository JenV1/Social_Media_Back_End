package com.example.backEndProject.service;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.PostRepository;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private UserRepository userRepository;
    private PostRepository postRepository;

    public CommentService(UserRepository userRepository, PostRepository postRepository){
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }



    public String heartComment(Long user_id, String user_name, String password, Long postId){




        User result_user = userRepository.findByID(user_id);
        Post result_post = postRepository.findPostByID(postId);


        if(result_user.getName().equals(user_name)
                && result_user.getPassword().equals(password)
                && result_post.getUser().getId().equals(postId)){

            return "hearted";


        }

            return "not hearted";


    }


}
