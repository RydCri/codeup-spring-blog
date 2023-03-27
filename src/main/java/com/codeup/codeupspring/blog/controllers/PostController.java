package com.codeup.codeupspring.blog.controllers;

import models.Post;
import models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {
private int id;
private String title;
private String body;
    @GetMapping(path = "/posts")

    public String postIndex(Model model) {
        List<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(1,"I'm leaving showbusiness", "I just think I'm not funny anymore."),
            new Post(2,"you never hear about quicksand anymore","idk, it's like, you just used to hear about it more"),
            new Post(3,"Dogs don't like me", "I'm not a bad person, I like Dogs, why don't they like me back?")
        ));
        model.addAttribute("posts",posts);
        return "post/index";
    }
    @GetMapping(path = "/posts/{n}")

    public String postId(@PathVariable int n,Model model) {
        List<Post> posts = new ArrayList<>(Arrays.asList(
                new Post(1,"I'm leaving showbusiness", "I just think I'm not funny anymore."),
                new Post(2,"you never hear about quicksand anymore","idk, it's like, you just used to hear about it more"),
                new Post(3,"Dogs don't like me", "I'm not a bad person, I like Dogs, why don't they like me back?")
        ));
//        Post post1 = new Post(id,title,body);
        model.addAttribute("posts",posts);
        model.addAttribute("postId", n);
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
//    GET	/posts	posts index page
//    GET	/posts/{id}	view an individual post
//    GET	/posts/create	view the form for creating a post
//    POST	/posts/create
//}//    public String placeOrder(@RequestParam String sauce, String cheese, String toppins){
////        return
////    }
