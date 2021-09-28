package com.exemple.demo.controler;

import com.exemple.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api")

public class HelloWorldControler {
    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldControler(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping(value="holamundo")
    public String saludar(){
      return helloWorldService.hello();
    }



}
