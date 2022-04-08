package com.example.demo.service;

import com.example.demo.model.Joke;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    private final static String JOKE_URL = "https://api.chucknorris.io/jokes/random";

    public Joke getRandomJoke() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Joke> response = restTemplate.getForEntity(JOKE_URL, Joke.class);

        return response.getBody();
    }
}
