package modelo;
public class ModeloRegistrarVenta {
    ArchivoTexto objArch;

    public ModeloRegistrarVenta() {
        objArch = new ArchivoTexto();
    }
    
    public void registrarVenta(String fecha, String producto, int cantidad, double total ){
        ModeloVenta objModVenta = new ModeloVenta();
        objModVenta.setFecha(fecha);
        objModVenta.setProducto(producto);
        objModVenta.setCantidad(cantidad);
        objModVenta.setTotal(total);
     
       
        
        objArch.abrirArchivoTexto('w', "ventas.txt");
        objArch.crearLinea(objModVenta.toString());
        objArch.cerrarArchivo('w');
    }

    
    
}
