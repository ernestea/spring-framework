package com.codefoe;

import com.codefoe.model.Comment;
import com.codefoe.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CodefoeApplication {

	public static void main(String[] args) {

		Comment comment = new Comment();
		comment.setAuthor("Brown");
		comment.setText("Spring Framework");

		ApplicationContext context = SpringApplication.run(CodefoeApplication.class, args);
		CommentService cs = context.getBean(CommentService.class);
		cs.publishComment(comment);
	}

}
