package com.demo.rest;

import com.demo.model.Greeting;
import com.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class InfoApi {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public List<Greeting> listGreetings(@RequestParam(required = false) String name) {
        return greetingService.find(name);
    }

    @PostMapping
    public Greeting postHallo(@RequestBody String sql) {
        return greetingService.sayHallo(sql);
    }
}
