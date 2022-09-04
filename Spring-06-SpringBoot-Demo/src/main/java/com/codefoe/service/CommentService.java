package com.codefoe.service;

import com.codefoe.model.Comment;
import com.codefoe.proxy.CommentNotificationProxy;
import com.codefoe.repository.CommentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")//Each time new Bean is created. Attention to Eager vs Lazy(It seems to become lazy when this is used)
//@Scope(BeanDefinition.SCOPE_PROTOTYPE) =>> equivalent to just @Scope("prototype")
@Lazy
@Data
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
