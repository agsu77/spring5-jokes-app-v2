package com.agsu.joke.jokesapp.service;

import java.util.logging.Logger;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService{

    private Logger logger;
    private static JokeServiceImpl instance = null;
    
    private JokeServiceImpl() {
        this.logger = Logger.getLogger(JokeServiceImpl.class.getName());
    }

    public static JokeServiceImpl singleton(){
        if(instance == null){
            instance = new JokeServiceImpl();
        }
        return instance;
    };

    @Override
    public String getRandomQuote() {
        try {
            ChuckNorrisQuotes servicio = new ChuckNorrisQuotes();
            return servicio.getRandomQuote();
        } catch (Exception e) {
            logger.info("Error al llamar el servicio ChuckNorrisQuotes "+e);
        }
        return "";
    }
    

}
