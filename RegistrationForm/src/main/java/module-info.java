module com.example.registrationform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.registrationform to javafx.fxml;
    exports com.example.registrationform;
}