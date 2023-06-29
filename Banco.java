public class Banco {
    private CuentaBancaria[] cuentas;
    private int noC;

    public Banco(int max) {
        cuentas = new CuentaBancaria[max];
        noC = 0;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        if (noC < cuentas.length) {
            cuentas[noC] = cuenta;
            noC++;
        } else {
            System.out.println("ERROR: No se pueden agregar más cuentas. El banco ha alcanzado su capacidad máxima.");
        }
    }

    public CuentaBancaria buscarCuenta(int noCuenta) {
        for (int i = 0; i < noC; i++) {
            if (cuentas[i].getNoCuenta() == noCuenta) {
                return cuentas[i];
            }
        }

        return null; // No se encontró la cuenta
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < noC; i++) {
            sb.append(cuentas[i].toString()).append("\n");
        }

        return sb.toString();
    }
}
