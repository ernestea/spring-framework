package com.codefoe;

import com.codefoe.config.ProjectConfig;
import com.codefoe.model.Comment;
import com.codefoe.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCodefoe {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Brown");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService1 = context.getBean(CommentService.class);
        CommentService commentService2 = context.getBean(CommentService.class);
        System.out.println(commentService1.equals(commentService2));


    }
}
