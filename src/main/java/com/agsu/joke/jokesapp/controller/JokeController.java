package com.agsu.joke.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.agsu.joke.jokesapp.service.JokeService;
import com.agsu.joke.jokesapp.service.JokeServiceImpl;

@Controller
public class JokeController {

    @GetMapping("/")
    public String getJoke(Model model) {
        JokeService service = JokeServiceImpl.singleton();
        String joke = service.getRandomQuote();
        System.out.println(joke);
        model.addAttribute("Quote", joke);
        return "jokeView";
    }

}
