package com.jlondono.HelloController;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllerSaludo {
    @GetMapping("/")
    public String SaludarGet(@RequestParam(name = "name", required = false, defaultValue = "Usuario desconocido") String name) {
        if(name.isEmpty()){ return "Bienvenido!! Usuario desconocido";
        }else {return "Bienvenido!! " + name;}
    }
}