module com.example.exerciceone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciceone to javafx.fxml;
    exports com.example.exerciceone;
}