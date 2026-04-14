package controlador;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloMostrarHistorial;
import modelo.ModeloRegistrarVenta;
import vista.VistaRegMostVentas;

public class ControladorRegistrarMostrarVentas {
    ModeloRegistrarVenta objModRegVenta;
    VistaRegMostVentas objViewRegventa;
    ModeloMostrarHistorial objModMostHistorial;

    public ControladorRegistrarMostrarVentas(VistaRegMostVentas objViewRegMostVentas) {
        this.objModRegVenta = new ModeloRegistrarVenta();  
        this.objViewRegventa = objViewRegMostVentas;
        this.objModMostHistorial =  new ModeloMostrarHistorial();
    }
    
    public void agregarVenta(
    String fecha,
    String producto,
    int cantidad,
    double total){
    
    this.objModRegVenta.registrarVenta (fecha, producto, cantidad, total);
    }
    
    
    
    public void mostrarHistorial(String[] columnas){
        Object[][] datos;
        datos = this.objModMostHistorial.mostrarHistorial(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);        
        this.objViewRegventa.tblVentas.setModel(modelo);         
    }
  
}
