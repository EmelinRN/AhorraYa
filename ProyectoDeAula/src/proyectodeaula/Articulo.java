
package proyectodeaula;


public class Articulo {
    
    private String marca;
    private double precio;
    private String  cantidad;
    private Cadena vendidoEn;

    public Articulo() {
    }

    public Articulo(String marca, double precio, String cantidad, Cadena vendidoEn) {
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.vendidoEn = vendidoEn;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Cadena getVendidoEn() {
        return vendidoEn;
    }

    public void setVendidoEn(Cadena vendidoEn) {
        this.vendidoEn = vendidoEn;
    }

    @Override
    public String toString() {
        return "Articulo{" + "marca=" + marca + ", precio=" + precio + ", cantidad=" + cantidad + ", vendidoEn=" + vendidoEn + '}';
    }
    
    
}
