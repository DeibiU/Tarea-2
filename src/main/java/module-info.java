module com.example.tarea2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.example.tarea2 to javafx.fxml;
    exports com.example.tarea2;
}