module com.example.exercices2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercices2 to javafx.fxml;
    exports com.example.exercices2;
}