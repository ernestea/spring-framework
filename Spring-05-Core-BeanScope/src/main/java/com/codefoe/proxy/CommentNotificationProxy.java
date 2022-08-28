package com.codefoe.proxy;

import com.codefoe.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
