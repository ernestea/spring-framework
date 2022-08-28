package com.codefoe.repository;

import com.codefoe.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
