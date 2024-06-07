package com.example.exercise4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void drawStairs(int numSteps) {
        if (numSteps > 0) {

            for (int i = 0; i < numSteps; i++) {
                for (int j = 0; j < numSteps - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else if (numSteps < 0) {

            numSteps = Math.abs(numSteps);
            for (int i = 0; i < numSteps; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|_");
            }
        } else {

            System.out.println("__");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int numSteps = scanner.nextInt();
        drawStairs(numSteps);
        scanner.close();
    }
}
