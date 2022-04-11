package com.example.demo.controller;

import com.example.demo.model.Joke;
import com.example.demo.service.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokes")
@RequiredArgsConstructor
@CrossOrigin
public class JokeController {

    private final JokeService jokeService;

    @GetMapping
    public ResponseEntity<Joke> getRandomJoke() {
        Joke joke = jokeService.getRandomJoke();

        return ResponseEntity.ok(joke);
    }
}