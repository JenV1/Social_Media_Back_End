package com.example.backEndProject.service;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {


    private PostRepository postRepository;
    private Post post;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public Post findPostByID(Long id){
        return postRepository.findPostByID(id);
    }

    public boolean deletePostByID(Long id) {
        return false;
    }
}
