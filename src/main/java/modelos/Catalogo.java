package modelos;

import java.util.ArrayList;
import java.util.Objects;

public class Catalogo {
    private String nombre;
    private String FechaDeCreacion;
    private ArrayList<Camiseta> camisetas = new ArrayList<>();

    /**
     * constructor de Catalogo
     * @author David Huertas
     * @param nombre
     * @param fechaDeCreacion
     */
    public Catalogo(String nombre, String fechaDeCreacion) {
        this.nombre = nombre;
        FechaDeCreacion = fechaDeCreacion;
        ArrayList<Camiseta> camisetas = new ArrayList<>();
    }

    /**
     * getter para nombre
     * @author David Huertas
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter para nombre
     * @author David Huertas
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter para fecha de creacion
     * @author David Huertas
     */
    public String getFechaDeCreacion() {
        return FechaDeCreacion;
    }

    /**
     * setter para fecha de creacion
     * @author David Huertas
     */
    public void setFechaDeCreacion(String fechaDeCreacion) {
        FechaDeCreacion = fechaDeCreacion;
    }

    /**
     * getter para camiseta
     * @author David Huertas
     */
    public ArrayList<Camiseta> getCamisetas() {
        return camisetas;
    }

    /**
     * setter para camiseta
     * @author David Huertas
     */
    public void setCamisetas(ArrayList<Camiseta> camisetas) {
        this.camisetas = camisetas;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "nombre='" + nombre + '\'' +
                ", FechaDeCreacion='" + FechaDeCreacion + '\'' +
                ", camisetas=" + camisetas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalogo catalogo)) return false;
        return Objects.equals(getNombre(), catalogo.getNombre()) && Objects.equals(getFechaDeCreacion(), catalogo.getFechaDeCreacion()) && Objects.equals(getCamisetas(), catalogo.getCamisetas());
    }
}