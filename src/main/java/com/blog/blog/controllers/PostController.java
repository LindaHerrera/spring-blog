package com.blog.blog.controllers;

import com.blog.blog.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    private String sayPost() {
        return "posts/index";
    }

//    ^^^this was refactored

    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    private String postsId(@PathVariable long id, Model viewModel) {
        Post post = new Post("box", "for sale");
        viewModel.addAttribute("post", post);
        return "posts/show";
    }

//    ^^^this was refactored

    @GetMapping(path = "/posts/create")
    @ResponseBody
    private String viewPosts() {
        return "view form for creating a post";
    }

    @PostMapping(path = "/posts/create")
    @ResponseBody
    private String postsCreate() {
        return "create new post";
    }
}


