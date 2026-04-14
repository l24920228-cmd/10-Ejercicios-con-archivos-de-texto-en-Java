package controlador;

import modelo.ModeloLogin;
import vista.VistaLogin;

public class ControladorLogin {
    ModeloLogin modelo;
    VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
        this.modelo = new ModeloLogin();
    }

    public void login(String usuario, String password) {
        boolean valido = modelo.validarUsuario(usuario, password);

        if (valido) {
            vista.txtMensaje.setText("Usuario válido");
        } else {
            vista.txtMensaje.setText("Usuario no válido");
        }
    }
}