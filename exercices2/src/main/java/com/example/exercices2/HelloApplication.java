package com.example.exercices2;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int numSteps = scanner.nextInt();

        int[] steps = new int[numSteps];

        System.out.println("Enter the steps (one by one): ");
        for (int i = 0; i < numSteps; i++) {
            steps[i] = scanner.nextInt();
        }

        int[] finalCoordinates = calculateFinalCoordinates(steps);

        System.out.println("Final coordinates: (" + finalCoordinates[0] + ", " + finalCoordinates[1] + ")");

        scanner.close();
        System.exit(0);
    }

    public static int[] calculateFinalCoordinates(int[] steps) {
        int x = 0, y = 0;
        int direction = 0;

        int[][] directions = {
                {0, 1},   // +y
                {-1, 0},  // -x
                {0, -1},  // -y
                {1, 0}    // +x
        };

        for (int step : steps) {
            int dx = directions[direction][0];
            int dy = directions[direction][1];

            x += step * dx;
            y += step * dy;

            direction = (direction + 1) % 4;
        }

        return new int[]{x, y};
    }
}
