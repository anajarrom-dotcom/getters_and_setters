package Mayor;

public class Jugador {

    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void actualizarPuntaje(int nuevoPuntaje) {

        if (nuevoPuntaje >= 0) {
            puntajeActual = nuevoPuntaje;

            if (nuevoPuntaje > puntajeMaximo) {
                puntajeMaximo = nuevoPuntaje;
            }
        }
    }
}
