package controlador;

import javafx.scene.control.ListView;
import modelos.*;

import java.util.ArrayList;
import java.util.Objects;

public class RegistrarUsuario {
    public static ArrayList<Usuario> usuarios= new ArrayList<>() ;

    public static void CrearUsuario(String id, String nombre, String apellido1, String apellido2, String direccion, String correo) {
        Usuario nuevoUsuario = new Usuario(id, nombre, apellido1, apellido2, direccion, correo);
        usuarios.add(nuevoUsuario);
        System.out.println(usuarios.toString());
    }

    public static void listarUsuarios(ListView lista){
        for(int i = 0; i<usuarios.size(); i++){
            lista.getItems().add(usuarios.get(i).toString());
        }
    }
}