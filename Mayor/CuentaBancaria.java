package Mayor;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int pin;

    public CuentaBancaria(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado == pin) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro realizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("PIN incorrecto");
        }
    }
}
