package com.demo.service;

import com.demo.model.Greeting;
import com.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting sayHallo(String name) {
        final Greeting greeting = new Greeting();
        greeting.setName(name);

        greetingRepository.save(greeting);
        return greeting;
    }

    public List<Greeting> find(String name) {
        if (name == null || name.isEmpty()){
            return greetingRepository.findAll();
        }

        return greetingRepository.findByName(name);
    }
}
