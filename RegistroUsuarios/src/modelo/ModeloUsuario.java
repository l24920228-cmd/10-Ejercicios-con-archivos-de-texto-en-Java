package modelo;

public class ModeloUsuario {
    String usuario;
    String password;

    public ModeloUsuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public ModeloUsuario() {
        this("", "");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.usuario + "," + this.password;
    }
}