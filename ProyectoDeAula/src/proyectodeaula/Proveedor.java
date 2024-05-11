
package proyectodeaula;


public class Proveedor extends Usuario {
    
    private int contraseña;
    private String ubicacion;
    

    public Proveedor() {
       
    }


    public Proveedor( String nombre, long cedula, int contraseña, String ubicacion) {
        super(nombre, cedula);
        this.contraseña=contraseña;
        this.ubicacion=ubicacion;
        
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
    
    

    