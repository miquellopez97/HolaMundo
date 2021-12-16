package com.example.testfx;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class HelloController {

    @FXML
    BorderPane background;

    @FXML
    public void changeRed(Event e){
        background.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, null)));
    }

    @FXML
    public void changeGreen(Event e){
        background.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, null)));
    }

    @FXML
    public void changeYellow(Event e){
        background.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, null)));
    }

    @FXML
    public void changeBlue(Event e){
        background.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, null)));
    }
}