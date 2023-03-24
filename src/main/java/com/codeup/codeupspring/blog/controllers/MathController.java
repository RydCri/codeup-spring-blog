package com.codeup.codeupspring.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    String operation;
    String conjunction;

    @GetMapping("/{operation}/{number}/{conjunction}/{number2}")
    @ResponseBody
    public String maths(@PathVariable String operation,@PathVariable int number,@PathVariable String conjunction, @PathVariable int number2) {
        if (operation.equals("add") && conjunction.equals("and")) {
            return "<h1 style='text-align:center;'>" + number + " plus " + number2 + " is " + (number + number2) + "! </h1>";
        }
        else if(operation.equals("subtract") && conjunction.equals("from")){
            return "<h1 style='text-align:center;'>" + number + " minus " + number2 + " is " + (number - number2) + "! </h1>";
            }
        else if(operation.equals("multiply") && conjunction.equals("and")){
            return "<h1 style='text-align:center;'>" + number + " times " + number2 + " is " + (number * number2) + "! </h1>";
            }
        else if(operation.equals("divide") && conjunction.equals("by")){
            return "<h1 style='text-align:center;'>" + number + " divided by " + number2 + " is " + (number / number2) + "! </h1>";
        }
        else return null;
    }
///add/3/and/4	7
///subtract/3/from/10	7
///multiply/4/and/5	20
///divide/6/by/3


}
