package com.example.kinoteatrfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn;


    @FXML
    void btnClick(ActionEvent event) {
        btn = (Button) event.getSource();
        btn.setStyle("-fx-background-color: #ff0000; -fx-text-fill: #ffffff;");
    }

    @FXML
    void initialize() {

    }

}
