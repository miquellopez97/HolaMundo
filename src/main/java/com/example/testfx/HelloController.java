package com.example.testfx;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class HelloController {

    @FXML
    Circle circle = new Circle();

    @FXML
    public void changeBG(Event e){
        circle.setFill(Color.RED);
    }
}