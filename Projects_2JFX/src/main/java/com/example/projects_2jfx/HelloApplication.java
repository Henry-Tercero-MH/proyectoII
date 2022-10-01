package com.example.projects_2jfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    private double xOffset;
    private double yOffset;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("hello-view.fxml"));
      FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        root.setOnMousePressed(new EventHandler<MouseEvent  >() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                xOffset= mouseEvent.getSceneX();
                yOffset= mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getSceneX()-xOffset);
                stage.setY(mouseEvent.getSceneY()-yOffset);
            }
        });
        Scene scene = new Scene(fxmlLoader.load(), 900, 450);
        stage.setTitle("CUESTIONARIO APP!");
scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}