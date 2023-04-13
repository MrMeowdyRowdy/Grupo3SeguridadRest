package com.example.demo.DataModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class Loader implements CommandLineRunner {
    private final DataRepo repository;
    @Autowired
    public Loader(DataRepo repository){
        this.repository = repository;
    }
    @Override
    public void run(String... strrings)throws Exception{
        this.repository.save(new Viajes("Juan", "123", "456"));
        this.repository.save(new Viajes("Pedro", "456", "789"));
        this.repository.save(new Viajes("Maria", "789", "012"));
    }
}
