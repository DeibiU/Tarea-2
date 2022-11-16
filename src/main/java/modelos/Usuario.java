package modelos;

public class Usuario {

    private String id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String correo;

    /**
     * constructor de Usuario
     *@author David Huertas
     * @param id
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param direccion
     * @param correo
     */
    public Usuario(String id, String nombre, String apellido1, String apellido2, String direccion, String correo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.correo = correo;
        this.id= id;
    }

    /**
     * getter para id
     * @author David Huertas
     */
    public String getId() {
        return id;
    }

    /**
     * setter para id
     * @author David Huertas
     */
    public void setId(String id) {
        this.id = id.replace(" ","");
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
     * getter para el primer apellido
     * @author David Huertas
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * setter para el primer apellido
     * @author David Huertas
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * getter para el segundo apellido
     * @author David Huertas
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * setter para el segundo apellido
     * @author David Huertas
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * getter para direccion
     * @author David Huertas
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * setter para direccion
     * @author David Huertas
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * getter para correo
     * @author David Huertas
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * setter para correo
     * @author David Huertas
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getId().equals(usuario.getId());
    }
}
