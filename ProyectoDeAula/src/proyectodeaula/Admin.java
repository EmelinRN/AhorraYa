
package proyectodeaula;


public class Admin extends Persona implements Ifunciones{

    public Admin() {
    }

    public Admin(String nombre, long cedula, int edad, String sexo) {
        super(nombre, cedula, edad, sexo);
    }

    @Override
    public void buscar(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminar(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregar(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
}
