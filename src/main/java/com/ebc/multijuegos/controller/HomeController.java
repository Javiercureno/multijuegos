package com.ebc.multijuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/")
public class HomeController {

    private static int visitCount = 0;
    private static LocalDateTime lastVisit = null;

    @GetMapping
    public String home() {
        visitCount++;
        lastVisit = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return "¡Hola CI/CD con Jenkins y Git Hooks! Bienvenido al homepage de MultiJuegos. "
                + "Este sitio ha sido visitado " + visitCount + " veces.\n"
                + "Última visita: " + lastVisit.format(formatter);
    }
}
