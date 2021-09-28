package com.exemple.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String hello() {
        return "<h1> Hello! </h1>";
    }
}
