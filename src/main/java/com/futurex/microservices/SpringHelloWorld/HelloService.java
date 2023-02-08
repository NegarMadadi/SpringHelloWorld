package com.futurex.microservices.SpringHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @RequestMapping("/")
    public String index() {
        return "Negar Madadi";
    }

    
    @RequestMapping("/abc")
    public String method2() {
        return "Negar Madadi ABC";
    }
}
