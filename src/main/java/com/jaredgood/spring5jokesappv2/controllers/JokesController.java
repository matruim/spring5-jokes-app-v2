package com.jaredgood.spring5jokesappv2.controllers;

import com.jaredgood.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeService jokeService;

    JokesController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(){
        return jokeService.getJoke();
    }
}
