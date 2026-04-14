package modelo;
public class ModeloMostrarInventario {
    ArchivoTexto objArch;
    
    
    public Object [][] mostrarInventario(String[] columnas){
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('r',"productos.txt");                
        Object[][] datos = this.objArch.obtenerMatrizLineas(columnas.length);        
        this.objArch.cerrarArchivo('r');
        return datos;
    
    
    }
    
    
    
    
    
    
}
