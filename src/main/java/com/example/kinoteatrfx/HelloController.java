package com.example.kinoteatrfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    private final boolean[][] isRed = new boolean[7][10];


    @FXML
    void btnClick(ActionEvent event) {
        Button btn = (Button)event.getSource();
        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);
        if (isRed[rowIndex][columnIndex]){
            isRed[rowIndex][columnIndex] = false;
            btn.setStyle("-fx-background-color: green");
        } else {
            isRed[rowIndex][columnIndex] = true;
            btn.setStyle("-fx-background-color: red");
        }
    }

    @FXML
    void initialize() {

    }

}
