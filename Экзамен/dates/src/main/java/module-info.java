module com.example.dates {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.dates to javafx.fxml;
    exports com.example.dates;
}