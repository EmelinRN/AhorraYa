
package proyectodeaula;

import java.util.ArrayList;


public class Producto {
    
    private String nombre;
    private ArrayList<Articulo> articulos;

    public Producto() {
    }

    public Producto(String nombre, ArrayList<Articulo> articulos) {
        this.nombre = nombre;
        this.articulos = articulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", articulos=" + articulos + '}';
    }
    
    
    
}
