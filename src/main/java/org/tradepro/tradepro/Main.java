package org.tradepro.tradepro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;


import java.util.Date;

public class Main extends Application {
    @Override
    public void start(@NotNull Stage stage){


        AnchorPane anchorPane=new AnchorPane();
        GridPane gridPane=new GridPane();
        gridPane.setTranslateX(250);
        gridPane.setTranslateY(100);
        Label usernameLabel=new Label("Username:");
        TextField usernameField=new TextField("Enter your username");
        Label passwordLabel=new Label("Password:");
        PasswordField passwordField=new PasswordField ();
        passwordField.setPromptText("Enter your password");
        gridPane.add(usernameLabel,0,0);
        gridPane.add(usernameField,1,0);
        gridPane.add(passwordLabel,0,1);
        gridPane.add(passwordField,1,1);
        Button btnLogin=new Button("Login");
        Button btnRegister=   new Button("Register");
        Hyperlink  fgp=new Hyperlink("Forgot Password");
        fgp.setTranslateX(300);
         fgp.setTranslateY(500);
         fgp.setOnAction(e->{});

        btnLogin.setTranslateX(370);
        btnLogin.setTranslateY(200);
        btnLogin.setOnAction(e -> {

            TradePlatform tradePlatform =new TradePlatform();
            try {
                tradePlatform.init();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }

        });
        btnRegister.setTranslateX(300);
        btnRegister.setTranslateY(200);
        btnRegister.setOnAction(e -> {

        });

        anchorPane.getChildren().addAll(gridPane,btnRegister,btnLogin,fgp);
        Scene scene = new Scene(anchorPane, 1530,780);
        scene.getStylesheets().addAll("tradepro.css");
        stage.setTitle("TradePro .Inc      "+ new Date(System.currentTimeMillis()));
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}