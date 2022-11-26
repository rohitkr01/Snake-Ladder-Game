module com.example.realsnackladder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.realsnackladder to javafx.fxml;
    exports com.example.realsnackladder;
}