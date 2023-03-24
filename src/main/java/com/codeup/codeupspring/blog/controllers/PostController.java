package com.codeup.codeupspring.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class PostController {
private int id;
    @GetMapping(path = "/posts")
    @ResponseBody
    public String postIndex() {
        return "../src/resources/postIndex";
    }
    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    public String postId(String id) {
        return "../src/resources/postPersonal" + id;
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
