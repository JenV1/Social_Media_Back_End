package com.example.backEndProject.service;

import com.example.backEndProject.method.FileWriter;
import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import com.example.backEndProject.repository.PostRepository;
import com.example.backEndProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PostService {


//    DEPENDENCY INJECTION

    @Autowired
    private UserRepository userRepository;
    @Autowired
    FileWriter fileWriter;
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


//    END OF DEPENDENCY INJECTION
//
//
//    START OF METHODS


    public List<Post> getAll() {
        return postRepository.findAll();
    }

//    public Post save(Post post) {
//        return postRepository.save(post);
//    }
//public void addPost(
//        Long id,
//        String content_text,
//        int number_of_likes,
//        boolean isBusinessAccount) {
//
//    Post post = new Post(id, content_text, number_of_likes, isBusinessAccount);
//    postRepository.save(post);
//}

    public Post findPostByID(Long id) {
        return postRepository.findPostByID(id);
    }


    public int findLikesByID(Long id) {

        Post current = null;
        try {
            current = postRepository.findById(id).get();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current.getNumber_of_likes();
    }


    public List searchPostsForKeyword(String keyword) {

//        Returns the posts that contain the relevant keyword

        return postRepository.findAll().stream()
                .map(Post::getContent_text)
                .filter(s -> s.contains(keyword))
                .toList();
    }


    public Post updateLikeCount(Long id)
            throws NoSuchElementException {

//        Adds like to specific post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        Post current = null;
        try {
            current = postRepository.findById(id).get();
            current.setNumber_of_likes(current.getNumber_of_likes() + 1);
            postRepository.save(current);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }


    public Post superLikePost(Long id)
            throws NoSuchElementException {

//        Same as above but with 2 likes added.
//        Adds like to specific post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        Post current = null;
        try {
            current = postRepository.findById(id).get();
            current.setNumber_of_likes(current.getNumber_of_likes() + 2);
            postRepository.save(current);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No matching post could be found for id: " + id);
        }

        return current;
    }


    public Post editPost(Long id,
                         String new_content)
            throws NoSuchElementException, IOException {

//        Edits already established post by id.
//        Try catch statement for the scenario where id is not found.
//        Created current outside of try catch to ensure it was within scope for the return statement.

        return fileWriter.fileWriter(id, new_content);

    }


    public String deletePostByID(Long id) {

        Post result = postRepository.findPostByID(id);
        postRepository.delete(result);

        return "Deleted";
    }


    public Post addPost(
            Long id,
            String content_text,
            Integer number_of_likes,
            boolean isBusinessAccount,
            Integer post_type_id,
            Long user_id) throws IOException {

        return fileWriter.addPostWriter(id,
                content_text, number_of_likes, isBusinessAccount, post_type_id, user_id);
    }

//    END OF METHODS
//
//
//    CODE IN PROGRESS


//    END OF CODE IN PROGRESS
//
//
//    END OF FILE

}
