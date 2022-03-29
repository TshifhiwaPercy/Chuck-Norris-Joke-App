package com.chuck.norris.jokes.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{
    private ChuckNorrisQuotes chuckNorrisQuotes;
    public JokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke(){
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
