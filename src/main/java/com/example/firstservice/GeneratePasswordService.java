package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name){
        Random rand = new Random();
        int upperbound = 999999999;
        int int_random = rand.nextInt(upperbound);
        return "Hi, " + name + "\nYour new password is " + int_random;
    }
}
