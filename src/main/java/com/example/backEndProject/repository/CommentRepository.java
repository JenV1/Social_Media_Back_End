package com.example.backEndProject.repository;

import com.example.backEndProject.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommentRepository extends JpaRepository<Comment,Long> {


    @Query(value = "SELECT * FROM comments WHERE id = ?",nativeQuery = true)
    Comment findCommentByID(Long id);

}
