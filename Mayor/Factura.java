package Mayor;

public class Factura {

    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {

        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;

        if (cantidad > 0) {
            this.cantidad = cantidad;
        }

        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        }
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println("Codigo: " + codigoFactura);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + precioUnitario);
        System.out.println("Total: " + calcularTotal());
    }
}
