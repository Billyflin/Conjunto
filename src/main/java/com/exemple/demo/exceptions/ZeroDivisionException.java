package com.exemple.demo.exceptions;

public class ZeroDivisionException extends RuntimeException{
    public ZeroDivisionException() {
        super("No se puede dividir entre cero");
    }
}
