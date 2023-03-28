package com.codeup.codeupspring.blog.controllers;

import com.codeup.codeupspring.blog.models.Post;
import com.codeup.codeupspring.blog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {
    private PostRepository postDao;
    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }
    @GetMapping(path = "/posts")
    public String postIndex(Model m) {
         List<Post> posts = postDao.findAll();
        m.addAttribute("posts",posts);
        return "post/index";
    }
    @GetMapping(path = "/posts/{n}")

    public String postId(@PathVariable int n,Model m) {
        List<Post> posts = postDao.findAll();
        m.addAttribute("posts",posts);
        m.addAttribute("postId", n);
        return "post/show";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "<form method=\"POST\"><button>Submit</button></form>";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String postSubmit() {
        return "Creating new post...";
    }

}

