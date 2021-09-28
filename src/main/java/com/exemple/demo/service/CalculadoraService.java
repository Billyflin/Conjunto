package com.exemple.demo.service;

import com.exemple.demo.exceptions.ZeroDivisionException;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public int sum(int a, int b) {
        return a+b;
    }

    public int res(int a, int b){
        return a-b;
    }

    public int mult(int a, int b){
        return a*b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ZeroDivisionException();
        }
        return a / b;
    }
}
