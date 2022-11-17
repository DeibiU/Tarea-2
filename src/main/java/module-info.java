module com.example.tarea2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens view to javafx.fxml;
    exports view;
}