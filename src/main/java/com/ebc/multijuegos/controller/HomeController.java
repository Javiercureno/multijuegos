package com.ebc.multijuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


@RestController
@RequestMapping("/") // Define la raíz como ruta base
public class HomeController {

    // Variable estática para contar las visitas
    private static int visitCount = 0;

    // Método para manejar las peticiones GET a la raíz
    @GetMapping
    public String home() {
        // Incrementa el contador de visitas
        visitCount++;
        
        // Mensaje de bienvenida con el número de visitas
        return "¡Hola CI/CD con Jenkins y Git Hooks! Bienvenido al homepage de MultiJuegos. "
                + "Este sitio ha sido visitado " + visitCount + " veces.";
    public class YellowRoseDrawing extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Beautiful Yellow Rose Drawing");
        Group root = new Group();

        // Dibuja los pétalos de rosa amarilla
        for (int i = 0; i < 12; i++) {
            double angle = Math.PI / 6 * i;
            double x = 150 + 80 * Math.cos(angle);
            double y = 150 + 80 * Math.sin(angle);
            Circle petal = new Circle(x, y, 20);
            petal.setFill(Color.YELLOW);
            root.getChildren().add(petal);
        }

        // Dibuja el centro de la rosa
        Circle center = new Circle(150, 150, 20);
        center.setFill(Color.RED);
        root.getChildren().add(center);

        // Dibuja el tallo marrón
        Rectangle stem = new Rectangle(145, 250, 10, 80);
        stem.setFill(Color.BROWN);
        root.getChildren().add(stem);

        // Agrega un mensaje debajo de la flor
        Text message = new Text(20, 40, "Para que ya no robes de tu trabajo❤");
        message.setFont(Font.font("Arial", 16));
        message.setFill(Color.BLACK);
        root.getChildren().add(message);

        // Crea la escena y agrega el grupo
        Scene scene = new Scene(root, 300, 300);

        // Agrega la escena al escenario
        primaryStage.setScene(scene);

        // Muestra la ventana
        primaryStage.show();


    }
}
