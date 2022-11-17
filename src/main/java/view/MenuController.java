package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    /**
     * Funcion para seleccionar la ventana para registrar camisetas
     */
    public void btnClickCamiseta() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("AddChema.fxml"));
        Parent root = fxmlLoader.load();
        RegistrarCamisetaController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Funcion para seleccionar la ventana para registar catalogos
     */
    public void btnClickCatalogo() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("AddCatalogo.fxml"));
        Parent root = fxmlLoader.load();
        RegistrarCatalogoController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Funcion para seleccionar la ventana para registar usuarios
     */
    public void btnClickUsuario() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("AddUser.fxml"));
        Parent root = fxmlLoader.load();
        RegistrarUsuarioController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Funcion para seleccionar la ventana para ver todos los datos
     */
    public void btnClickListas() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("Listas.fxml"));
        Parent root = fxmlLoader.load();
        ListasController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }
}
