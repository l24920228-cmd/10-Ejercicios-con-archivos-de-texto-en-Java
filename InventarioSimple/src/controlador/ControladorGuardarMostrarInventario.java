package controlador;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloMostrarInventario;
import modelo.ModeloGuardarProducto;
import vista.VistaInventario;

public class ControladorGuardarMostrarInventario {
    ModeloGuardarProducto objModGuarProducto;
    VistaInventario objViewInventario;
    ModeloMostrarInventario objModMostInventario;

    public ControladorGuardarMostrarInventario(VistaInventario objViewInventario) {
        this.objModGuarProducto = new ModeloGuardarProducto();  
        this.objViewInventario = objViewInventario;
        this.objModMostInventario =  new ModeloMostrarInventario();
    }
    
    public void agregarProducto(
    String id,
    String nombre,
    int cantidad,
    double precio){
    
    this.objModGuarProducto.agregarProducto (id, nombre, cantidad, precio);
    }
    
    
    
    public void mostrarInventario(String[] columnas){
        Object[][] datos;
        datos = this.objModMostInventario.mostrarInventario(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);        
        this.objViewInventario.tblProductos.setModel(modelo);         
    }
  
}
