package modelo;
public class ModeloVenta {
    String fecha;
    String producto;
    int cantidad;
    double total;

    public ModeloVenta(String fecha, String producto, int cantidad, double total) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public ModeloVenta() {
        this("","",0,0);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double precio) {
        this.total = precio;
    }

    
    
    @Override
    public String toString() {
        return 
        this.getFecha()+ "," +
        this.getProducto()+ "," +
        this.getCantidad() + "," +
        this.getTotal();
    }

    
  
    
   
   
}
