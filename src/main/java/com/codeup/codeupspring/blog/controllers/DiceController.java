package com.codeup.codeupspring.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ThreadLocalRandom;


@Controller
public class DiceController {
    @GetMapping("/roll")
    public String diceRoll(){
    return "diceAsk";
    }
    @GetMapping("/roll/{n}")
    public String guess(@PathVariable int n, Model model) {
        model.addAttribute("guess",n);
        int roll = ThreadLocalRandom.current().nextInt(1, 6+1   );
    return  "diceGuess";
    }
    }

