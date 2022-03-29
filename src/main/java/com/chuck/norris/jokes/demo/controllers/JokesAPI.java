package com.chuck.norris.jokes.demo.controllers;

import com.chuck.norris.jokes.demo.services.JokeService;
import com.chuck.norris.jokes.demo.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class JokesAPI {
    @Autowired
    private JokeService jokeService;
    @GetMapping(value="/joke")
    public String nextJoke(){return jokeService.getJoke();}
}
