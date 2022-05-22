package com.example.backEndProject.service;

import com.example.backEndProject.EntityManager.EMF;
import com.example.backEndProject.model.Comment;
import com.example.backEndProject.model.Post;
import com.example.backEndProject.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Service
public class CommentService {

    public String heartComment(int user_id, String user_name, String password, int postId ){


        EntityManager em =  EMF.get().createEntityManager();
        User user = em.createQuery("SELECT user FROM users WHERE id = ?1",User.class)
                .setParameter(1,user_id)
                .getSingleResult();


        Query getPostUserIdQuery = em.createNativeQuery("SELECT user_id FROM posts WHERE id = ?1");
        getPostUserIdQuery.setParameter(1,postId);
        int postUserId = ( (Number) getPostUserIdQuery.getSingleResult()).intValue();



        if(user.getName().equals(user_name) && user.getPassword().equals(password) && postUserId == user_id){

            return "Access Granted, comment hearted";


        }

        return "Access denied";

    }


}
