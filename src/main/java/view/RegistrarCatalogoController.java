package view;

import controlador.RegistrarCatalogo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelos.Catalogo;
import javafx.fxml.FXML;

import java.util.ArrayList;


public class RegistrarCatalogoController {
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtFechaDeCreacion;
    @FXML
    public Button btnCrearCatalogo;

    private RegistrarCatalogo controladorcatalogo = new RegistrarCatalogo();

    public void btnCrearCatalogo() {
        String id = txtNombre.getText();
        String fechaDeCreacion = txtFechaDeCreacion.getText();
        controladorcatalogo.CrearCatalogo(id, fechaDeCreacion);
    }
}
