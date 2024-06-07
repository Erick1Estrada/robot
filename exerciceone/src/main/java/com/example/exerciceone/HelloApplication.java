package com.example.exerciceone;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Scanner scanner = new Scanner(System.in);


        System.out.println("The pair may contain combinations of " +
                "‘R’ (stone), ‘P’ (paper), or ‘S’ (scissors).");


        System.out.println("Enter the move of Player 1 (R, P, S): ");
        System.out.println("SYNTAXIS:(PLAYER1-PLAYER2) ");
        String playerOneMove = scanner.nextLine();


        System.out.print("Enter the move of Player 2 (R, P, S): ");
        String playerTwoMove = scanner.nextLine();


        if (playerOneMove.equals(playerTwoMove)) {

            System.out.println("Result: Tie");
        } else if ((playerOneMove.equals("R") && playerTwoMove.equals("S")) ||
                (playerOneMove.equals("S") && playerTwoMove.equals("P")) ||
                (playerOneMove.equals("P") && playerTwoMove.equals("R"))) {

            System.out.println("Result: Player 1 Wins");
        } else {

            System.out.println("Result: Player 2 Wins");
        }


        scanner.close();


        Platform.exit();
    }


    public static void main(String[] args) {
        launch();
    }
}