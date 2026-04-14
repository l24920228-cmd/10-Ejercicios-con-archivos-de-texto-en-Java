package modelo;

public class ModeloLogin {

    public boolean validarUsuario(String usuario, String password) {
        ArchivoTexto arch = new ArchivoTexto();
        arch.abrirArchivoTexto('r', "usuarios.txt");

        Object[][] datos = arch.obtenerMatrizLineas(2);
        arch.cerrarArchivo('r');

        for (int i = 0; i < datos.length; i++) {
            String user = datos[i][0].toString();
            String pass = datos[i][1].toString();

            if (user.equals(usuario) && pass.equals(password)) {
                return true;
            }
        }

        return false;
    }
}