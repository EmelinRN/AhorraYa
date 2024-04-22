package proyectodeaula;


public class Despensa extends Producto {

    public Despensa() {
    }

    public Despensa(String nombreProducto, String cantidad, double precio, long codigo, Proveedor vendidoEn) {
        super(nombreProducto, cantidad, precio, codigo, vendidoEn);
    }
    
    @Override
    public boolean buscarProducto(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
