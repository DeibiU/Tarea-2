package controlador;

import javafx.scene.control.ListView;
import modelos.*;

import java.util.ArrayList;
import java.util.Objects;

public class RegistrarCatalogo {
    public static ArrayList<Catalogo> catalogos= new ArrayList<>() ;

    public static void CrearCatalogo(String nombre, String fechaDeCreacion) {
        Catalogo nuevoCatalogo = new Catalogo(nombre, fechaDeCreacion);
        catalogos.add(nuevoCatalogo);
        System.out.println(catalogos.toString());
    }

    public static void listarCatalogos(ListView lista){
        for(int i = 0; i<catalogos.size(); i++){
            lista.getItems().add(catalogos.get(i).toString());
        }
    }
}
