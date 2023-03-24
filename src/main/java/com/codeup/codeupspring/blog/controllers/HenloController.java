package com.codeup.codeupspring.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HenloController {
@GetMapping("/henlo")
    public String henlo(){
    return "henlo";
}
    @GetMapping("/hello")
    @ResponseBody
    public String Hello(@RequestParam(defaultValue = "true")boolean uppercase){ //defaultValue is 'true' otherwise throws bad request
        if(uppercase){
            return "HELLO WORLD"; //hello?uppercase=true
        }else {
            return "hello world"; //hello?uppercase=false
        }
    }

    @GetMapping("/hello/{name}/{lname}") //pass name/lname to url
    @ResponseBody
    public String Greet(@PathVariable String name, @PathVariable String lname){ //pathvars add further mapping
        return "<h1 style='text-align:center;'>" + "Hello " + name + " " + lname + "</h1>";
    }
}



