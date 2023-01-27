package org.tradepro.tradepro;

import com.sun.scenario.animation.AbstractPrimaryTimer;
import javafx.animation.Animation;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;


public class TradingScreen extends Node {
    double maxWidth= 1550;
    double maxHeight=800;
    double minWidth =500;
    double minHeight=500;
    double prefWidth =1530;
    double prefHeight =780;
    void Display() throws Exception {

        Stage stage = new Stage();


        AnchorPane anchorPane=new AnchorPane(createContent());
        Scene scene = new Scene(anchorPane,prefWidth,prefHeight);
        scene.getStylesheets().add("tradepro.css");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();












    }




    public Parent createContent() throws Exception {

        // Box
        Box testBox = new Box(5, 5, 5);
        testBox.setMaterial(new PhongMaterial(Color.RED));
        testBox.setDrawMode(DrawMode.LINE);

        // Create and position camera
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.getTransforms().addAll (
                new Rotate(-20, Rotate.Y_AXIS),
                new Rotate(-20, Rotate.X_AXIS),
                new Translate(0, 0, -15));

        // Build the Scene Graph
        Group root = new Group();
        root.getChildren().add(camera);
        root.getChildren().add(testBox);

        // Use a SubScene
        SubScene subScene = new SubScene(root, 300,300);
        subScene.setFill(Color.ALICEBLUE);
        subScene.setCamera(camera);
        Group group = new Group();
        group.getChildren().add(subScene);
        return group;
    }
}
