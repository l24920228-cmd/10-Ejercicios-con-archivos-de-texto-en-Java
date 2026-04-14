package modelo;
public class ModeloMostrarHistorial {
    ArchivoTexto objArch;
    
    
    public Object [][] mostrarHistorial(String[] columnas){
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('r',"ventas.txt");                
        Object[][] datos = this.objArch.obtenerMatrizLineas(columnas.length);        
        this.objArch.cerrarArchivo('r');
        return datos;
    
    
    }
    
    
    
    
    
    
}
