
package proyectodeaula;


public class Articulo {
    
    private String nombreArticulo;
    private double precio;
    private long codigo;
    
    
    //RELACION CON LA CLASE PROVEEDOR
    private Proveedor vendidoEn;

    public Articulo() {
        
    }

    public Articulo(String nombreArticulo, double precio, long codigo, Proveedor vendidoEn) {
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.codigo= codigo;
        this.vendidoEn = vendidoEn;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
     public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getVendidoEn() {
        return vendidoEn.getNombre();
    }

 
    

    @Override
    public String toString() {
        return   nombreArticulo +  "   "+ precio + "   "+ vendidoEn.getNombre() + "   " + vendidoEn.getUbicacion()+ "\n";
    }
    
    
     
    
    
    
   
    
    
    
}
    

    