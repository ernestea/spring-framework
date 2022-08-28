package com.codefoe.repository;

import com.codefoe.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Saving comment into database : " + comment.getText());
    }
}
