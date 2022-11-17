package controlador;

import javafx.scene.control.ListView;
import modelos.*;

import java.util.ArrayList;
import java.util.Objects;

public class RegistrarCamiseta {
    public static ArrayList<Camiseta> camisetas= new ArrayList<>() ;

    public void CrearCamiseta(String id, String color, String tamano, String img, String precio, String descripcion) {
        Camiseta nuevaCamiseta = new Camiseta(id, color, tamano, img, precio, descripcion);
        camisetas.add(nuevaCamiseta);
        System.out.println(camisetas.toString());
    }

    public static void listarCamisetas(ListView lista){
        for(int i = 0; i<camisetas.size(); i++){
            lista.getItems().add(camisetas.get(i).toString());
        }
    }
}
