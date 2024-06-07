module com.example.excercise3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.excercise3 to javafx.fxml;
    exports com.example.excercise3;
}