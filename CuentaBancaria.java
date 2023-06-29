public class CuentaBancaria {
    private double balance;
    private int noCuenta;

    public CuentaBancaria(double balanceInicial, int noCuenta) {
        if (balanceInicial < 0) {
            throw new IllegalArgumentException("El balance inicial no puede ser negativo.");
        }

        if (String.valueOf(noCuenta).length() != 5) {
            throw new IllegalArgumentException("El número de cuenta debe tener 5 dígitos.");
        }

        this.balance = balanceInicial;
        this.noCuenta = noCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void depositar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("¡Cantidad negativa, no es posible depositar! Proporcione un valor positivo.");
        }

        balance += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("¡Cantidad negativa, no es posible retirar! Proporcione un valor positivo.");
        }

        if (cantidad > balance) {
            throw new RuntimeException("¡No hay fondos suficientes!");
        }

        balance -= cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta: " + noCuenta + ", Balance: " + balance;
    }
}
