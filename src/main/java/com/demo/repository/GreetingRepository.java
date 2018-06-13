package com.demo.repository;

import com.demo.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

    List<Greeting> findByName(String name);
}
