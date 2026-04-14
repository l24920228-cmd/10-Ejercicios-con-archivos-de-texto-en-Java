package controlador;

import modelo.ModeloRegistrar;
import vista.VistaRegistro;

public class ControladorRegistrar {
    ModeloRegistrar modelo;
    VistaRegistro vista;

    public ControladorRegistrar(VistaRegistro vista) {
        this.vista = vista;
        this.modelo = new ModeloRegistrar();
    }

    public void registrar(String usuario, String password) {
        modelo.guardarUsuario(usuario, password);
    }
}