package com.logging.logs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logs")
public class TestInterface {

    //Server je na portu 1111 pa za doc do ovoga treba localhost:1111/logs
    //Namjenjeno za testiranje
    @GetMapping
    public String tester(){
        return "Hello World";
    }

}
