package com.example.backEndProject.repository;

import com.example.backEndProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "SELECT * FROM posts WHERE id = ?",nativeQuery = true)
    Post findPostByID(Long id);

    @Query(value = "DELETE FROM posts WHERE post_id = ?", nativeQuery = true)
    ResponseEntity<Long> deletePostByID(Long id);

    // delete query to delete a post by a specific post_id
}
