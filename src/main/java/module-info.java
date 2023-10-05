module com.example.kinoteatrfx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.kinoteatrfx to javafx.fxml;
    exports com.example.kinoteatrfx;
}