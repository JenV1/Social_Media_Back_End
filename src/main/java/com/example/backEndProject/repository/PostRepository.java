package com.example.backEndProject.repository;

import com.example.backEndProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "SELECT * FROM posts WHERE id = ?",nativeQuery = true)
    Post findPostByID(Long id);

    // delete query to delete a post by a specific post_id
    @Query(value = "DELETE FROM posts WHERE post_id = ?", nativeQuery = true)
    String deletePostByID(Long id);


    @Query(value = "SELECT * FROM posts WHERE is_business_account = ?", nativeQuery = true)
    Post searchAllBusinessAccountPosts(Boolean isBusinessAccount);

    @Query(value = "SELECT * FROM posts WHERE is_business_account = ?1 AND company_id = ?2", nativeQuery = true)
    List<Post> searchForSpecificBusinessAccountPosts(boolean isBusinessAccount, int company_id);


}
