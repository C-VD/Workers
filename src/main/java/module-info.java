module com.cvd.worker {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.cvd.worker to javafx.fxml;
    exports com.cvd.worker;
}