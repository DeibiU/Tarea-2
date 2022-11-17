package view;

import controlador.RegistrarCatalogo;
import controlador.RegistrarUsuario;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelos.Usuario;
import javafx.fxml.FXML;

import java.util.ArrayList;


public class RegistrarUsuarioController {
    @FXML
    public TextField txtIdUsuario;
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtApellido1;
    @FXML
    public TextField txtApellido2;
    @FXML
    public TextField txtDireccion;
    @FXML
    public TextField txtCorreo;
    @FXML
    public Button btnCrearUsuario;

    private RegistrarUsuario controladorusuario = new RegistrarUsuario();

    public void BtnCrearUsuario() {
        String id = txtIdUsuario.getText();
        String nombre = txtNombre.getText();
        String apellido1 = txtApellido1.getText();
        String apellido2 = txtApellido2.getText();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        controladorusuario.CrearUsuario(id, nombre, apellido1, apellido2, direccion, correo);
    }
}
