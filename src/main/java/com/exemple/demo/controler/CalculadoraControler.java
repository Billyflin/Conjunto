package com.exemple.demo.controler;

import com.exemple.demo.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api")
public class CalculadoraControler {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraControler(CalculadoraService calculadoraService){
        this.calculadoraService=calculadoraService;
    }

    @GetMapping(value= "suma/{a}/{b}")
    public int sum(@PathVariable int a,@PathVariable int b){
        return calculadoraService.sum(a,b);
    }
    @GetMapping(value= "rest/{a}/{b}")
    public int rest(@PathVariable int a,@PathVariable int b){
        return calculadoraService.res(a,b);
    }

    @GetMapping(value= "div/{a}/{b}")
    public int div(@PathVariable int a,@PathVariable int b){
        return calculadoraService.divide(a,b);
    }
    @GetMapping(value= "mult/{a}/{b}")
    public int mult(@PathVariable int a,@PathVariable int b){
        return calculadoraService.mult(a,b);
    }

}
