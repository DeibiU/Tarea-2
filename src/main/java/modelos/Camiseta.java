package modelos;

public class Camiseta {
        private String id;
        private String color;
        private String tamano;
        private String img;
        private Double precio;
        private String descripcion;

    /**
     * constructor de Camisetas
     * @author David Huertas
     * @param id
     * @param color
     * @param tamano
     * @param img
     * @param precio
     * @param descripcion
     */
    public Camiseta(String id, String color, String tamano, String img, Double precio, String descripcion) {
        this.id = id;
        this.color = color;
        this.tamano = tamano;
        this.img = img;
        this.precio = precio;
        this.descripcion = descripcion;
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
     * getter para color
     * @author David Huertas
     */
    public String getColor() {
            return color;
        }

    /**
     * setter para color
     * @author David Huertas
     */
    public void setColor(String color) {
            this.color = color;
        }

    /**
     * getter para tamano
     * @author David Huertas
     */
    public String getTamano() {
            return tamano;
        }

    /**
     * setter para tamano
     * @author David Huertas
     */
    public void setTamano(String tamano) {
            this.tamano = tamano;
        }

    /**
     * getter para img
     * @author David Huertas
     */
    public String getImg() {
            return img;
        }

    /**
     * setter para img
     * @author David Huertas
     */
    public void setImg(String img) {
            this.img = img;
        }

    /**
     * getter para precio
     * @author David Huertas
     */
    public Double getPrecio() {
            return precio;
        }

    /**
     * setter para precio
     * @author David Huertas
     */
    public void setPrecio(Double precio) {
            this.precio = precio;
        }

    /**
     * getter para descripcion
     * @author David Huertas
     */
    public String getDescripcion() {
            return descripcion;
        }

    /**
     * setter para descripcion
     * @author David Huertas
     */
    public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camiseta)) return false;
        Camiseta camiseta = (Camiseta) o;
        return getId().equals(camiseta.getId());
    }
}
