package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    @ResponseBody
    private String sayPost() {
        return "posts index page";
    }


    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    private String postsId() {
        return "view an individual post";
    }

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


