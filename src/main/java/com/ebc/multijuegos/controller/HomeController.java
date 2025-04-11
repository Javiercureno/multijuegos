package com.ebc.multijuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // Define la raíz como ruta base
public class HomeController {

    // Variable estática para contar las visitas
    private static int visitCount = 0;

    // Método para manejar las peticiones GET a la raíz
    @GetMapping
    public String home() {
          return """
        <html>
            <body>
                <h1 style="font-size: 48px; color: red;">¡Hola mundo!</h1>
                <p style="font-size: 32px; color: blue;">CI/CD Listo... Jenkins lee hooks - TEST 06 !!!</p>
            </body>
        </html>
        """;
        // Incrementa el contador de visitas
        visitCount++;
        
        // Mensaje de bienvenida con el número de visitas
        return "¡Hola CI/CD con Jenkins y Git Hooks! Bienvenido al homepage de MultiJuegos. "
                + "Este sitio ha sido visitado " + visitCount + " veces.";

    }
}
