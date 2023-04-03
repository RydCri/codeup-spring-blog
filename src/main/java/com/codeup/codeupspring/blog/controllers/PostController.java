package com.codeup.codeupspring.blog.controllers;

import com.codeup.codeupspring.blog.models.Post;
import com.codeup.codeupspring.blog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public String create() {
        return "post/create";
    }
    @PostMapping("/posts/create")
    public String postSubmit(@RequestParam String title, @RequestParam String body) {
        Post newpost = new Post(title,body);
        postDao.save(newpost);
        return "redirect:/posts";
    }

//    @PostMapping("/posts/edit")
//    public String editPost(String title, String body){
//        Post post = new Post(title, body);
//        postDao.save(post);
//        return "post/edit";
//    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable long id) {
        postDao.deleteById(id);
    }
}

