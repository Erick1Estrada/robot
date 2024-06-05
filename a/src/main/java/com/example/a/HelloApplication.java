package com.example.a;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de escalones: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("_");
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println("_");
                for (int j = 0; j <= i; j++) {
                    System.out.print("  ");
                }
                System.out.println("|");
            }
        } else {
            n = -n;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println("_");
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println("|");
            }
        }

        scanner.close();
    }
}
