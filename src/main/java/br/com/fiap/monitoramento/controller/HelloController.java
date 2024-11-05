package br.com.fiap.monitoramento.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/ola")
    public String getOla(){
        return "Ola Mundo";
    }
}
