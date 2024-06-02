package com.stackroute.springdeploymentdemo.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/home")
    public Object home() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Tom");
        object.put("email", "tom@gmail.com");
        System.out.println("Hai .. Controller");
        return object;
    }

     @GetMapping("/dummy")
    public Object home2() {
        Map<String, String> object = new HashMap<>();
        object.put("message", "welcome to dummy");
        System.out.println("Hai .. Controller");
        return object;
    }


}
