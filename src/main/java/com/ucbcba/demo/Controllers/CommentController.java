package com.ucbcba.demo.Controllers;

import com.ucbcba.demo.entities.Comment;
import com.ucbcba.demo.services.CommentService;
import com.ucbcba.demo.services.CommentServiceImpl;
import com.ucbcba.demo.entities.Restaurant;
import com.ucbcba.demo.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CommentController {
    private CommentService commentService;

    @Autowired
    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    String save(Comment comment) {
        commentService.saveComment(comment);
        return "redirect:/admin/restaurant/"+comment.getRestaurant().getId();
    }
}
