package modelo;
public class ModeloGuardarProducto {
    ArchivoTexto objArch;

    public ModeloGuardarProducto() {
        objArch = new ArchivoTexto();
    }
    
    public void agregarProducto(String id, String nombre, int cantidad, double precio){
        ModeloProducto objModProducto = new ModeloProducto();
        objModProducto.setId(id);
        objModProducto.setNombre(nombre);
        objModProducto.setCantidad(cantidad);
        objModProducto.setPrecio(precio);
        
        objArch.abrirArchivoTexto('w', "productos.txt");
        objArch.crearLinea(objModProducto.toString());
        objArch.cerrarArchivo('w');
    }

    
    
}
