package Mayor;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        }
    }

    public String mostrarHora() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
