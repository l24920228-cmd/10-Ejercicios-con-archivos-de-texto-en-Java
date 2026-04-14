package modelo;

public class ModeloRegistrar {
    ArchivoTexto arch;

    public ModeloRegistrar() {
        arch = new ArchivoTexto();
    }

    public void guardarUsuario(String usuario, String password) {
        arch.abrirArchivoTexto('w', "usuarios.txt");
        arch.crearLinea(usuario + "," + password);
        arch.cerrarArchivo('w');
    }
}