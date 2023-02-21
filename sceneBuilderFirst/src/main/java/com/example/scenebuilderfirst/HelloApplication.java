package com.example.scenebuilderfirst;

import entities.Escale;
import entities.Vol;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.ServiceEscale;
import services.ServiceVol;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 569, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        ServiceEscale se = new ServiceEscale();
        ServiceVol sv = new ServiceVol();
        Escale t = new Escale(30,"h","hh","hhh","hhhh");
        Vol v = new Vol(1,"a","aa","aa","aa","aa",23,t);

        try {


            System.out.println(se.selectAll());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }}






    }
