package com.example.backEndProject.service;

import com.example.backEndProject.model.Post;
import com.example.backEndProject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.yaml.snakeyaml.events.Event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PostService {


    private PostRepository postRepository;

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

    public ResponseEntity<Long> deletePostByID(Long id) {

            try{
                Post result = postRepository.findPostByID(id);
                postRepository.delete(result);

            }
            catch (IllegalArgumentException e){
                new Exception("Post does not exist!");
            }

            return new ResponseEntity<>(id, HttpStatus.OK);
        }
}
