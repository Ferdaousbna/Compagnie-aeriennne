module com.example.scenebuilderfirst {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.scenebuilderfirst to javafx.fxml;
    exports com.example.scenebuilderfirst;
}