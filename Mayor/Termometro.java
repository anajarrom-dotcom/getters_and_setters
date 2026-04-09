package Mayor;

public class Termometro {

    private double celsius;

    public void setCelsius(double temperatura) {
        if (temperatura >= -273.15) {
            this.celsius = temperatura;
        }
    }

    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}
