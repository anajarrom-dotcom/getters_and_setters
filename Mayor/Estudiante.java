package Mayor;

public class Estudiante {

    private String carnet;
    private String nombre;
    private double promedio;

    public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;

        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        }
    }

    public boolean esBecado() {
        if (promedio >= 85) {
            return true;
        } else {
            return false;
        }
    }
}
