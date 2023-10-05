package com.example.kinoteatrfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {
    @FXML
    private GridPane gridPane;

    private boolean[][] isGreen = new boolean[7][10];


    @FXML
    void btnClick(ActionEvent event) {
        Button btn = (Button)event.getSource();
        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);
        if (isGreen[rowIndex][columnIndex]){
            isGreen[rowIndex][columnIndex] = false;
            btn.setStyle("-fx-background-color: #ff0000");
        } else {
            isGreen[rowIndex][columnIndex] = true;
            btn.setStyle("-fx-background-color: #fa0123");
        }
    }

    @FXML
    void initialize() {

    }

}
