package view;

import controlador.RegistrarCamiseta;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import modelos.Camiseta;
import javafx.fxml.FXML;

import java.util.ArrayList;


public class RegistrarCamisetaController {
    @FXML
    public TextField txtIdCamiseta;
    @FXML
    public TextField txtColor;
    @FXML
    public TextField txtTamano;
    @FXML
    public TextField txtImg;
    @FXML
    public TextField txtPrecio;
    @FXML
    public TextField txtDescripcion;
    @FXML
    public Button btnCrearCamiseta;

    private RegistrarCamiseta controladorcamiseta = new RegistrarCamiseta();

    public void btnCrearCamiseta() {
        String id = txtIdCamiseta.getText();
        String color = txtColor.getText();
        String tamano = txtTamano.getText();
        String img = txtImg.getText();
        String precio = txtPrecio.getText();
        String descripcion = txtDescripcion.getText();
        controladorcamiseta.CrearCamiseta(id, color, tamano, img, precio, descripcion);

    }
}
