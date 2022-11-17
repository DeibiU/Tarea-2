package view;

import controlador.RegistrarCamiseta;
import controlador.RegistrarCatalogo;
import controlador.RegistrarUsuario;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ListasController {

    @FXML
    public ListView ListViewUsuarios;
    @FXML
    public ListView ListViewCamisetas;
    @FXML
    public ListView ListViewCatalogos;

    public void btnRefrescar(){
    RegistrarUsuario.listarUsuarios(ListViewUsuarios);
    RegistrarCamiseta.listarCamisetas(ListViewCamisetas);
    RegistrarCatalogo.listarCatalogos(ListViewCatalogos);
    }
}
