
package t3;
public class Producto extends Marca{

    private String NombreProd;
    private double PrecioProd;
    public Producto(String nombre, double precio, String marquin) {
        super(marquin);
        this.NombreProd = nombre;
        this.PrecioProd = precio;
    }

    public String getNombre() {
        return NombreProd;
    }

    public void setNombre(String nombre) {
        this.NombreProd = nombre;
    }

    public double getPrecio() {
        return PrecioProd;
    }

    public void setPrecio(double precio) {
        this.PrecioProd = precio;
    }

    public String getNombreMarca() {
        return NombreMarca;
    }

    public void setNombreMarca(String marquin) {
        this.NombreMarca = marquin;
    }
}


