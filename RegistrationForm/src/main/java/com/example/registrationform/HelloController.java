package com.example.registrationform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController
{
    @FXML
    private Label type;

    @FXML
    private Label status;

    @FXML
    private TextField fullName;

    @FXML
    private TextField emailId;

    @FXML
    private TextField password;



    public void register(ActionEvent event) throws Exception {
        if (fullName.getText().equals("rashadha") && emailId.getText().equals("rimsan.20210001@iit.ac.lk") && password.getText().equals("rashadha@73"))
        {

                status.setText("Registration Successfully");
                Stage stage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 320, 240);
                stage.setTitle("Hello!");
                stage.setScene(scene);
                stage.show();


        }
        else
        {
            status.setText("Registration failed");

        }
    }
}
