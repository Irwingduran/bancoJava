import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int obtenerOpcionUsuario() {
        try {
            System.out.print("Ingrese una opción: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Opción inválida. Debe ingresar un valor numérico.");
            scanner.nextLine(); // Limpiar el buffer del escáner
            return obtenerOpcionUsuario();
        }
    }

    public static double obtenerCantidad() {
        try {
            System.out.print("Ingrese una cantidad: ");
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Cantidad inválida. Debe ingresar un valor numérico.");
            scanner.nextLine(); // Limpiar el buffer del escáner
            return obtenerCantidad();
        }
    }

    public static int obtenerNoCuenta() {
        try {
            System.out.print("Ingrese el número de cuenta: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Número de cuenta inválido. Debe ingresar un valor numérico.");
            scanner.nextLine(); // Limpiar el buffer del escáner
            return obtenerNoCuenta();
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco(10); // Crear una instancia del objeto Banco

        int opcion;
        do {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Agregar NoCuenta");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Sacar Dinero");
            System.out.println("4. Exit");
            opcion = obtenerOpcionUsuario();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese el balance inicial: ");
                        double balanceInicial = scanner.nextDouble();
                        System.out.print("Ingrese el número de cuenta: ");
                        int noCuenta = scanner.nextInt();
                        CuentaBancaria cuenta = new CuentaBancaria(balanceInicial, noCuenta);
                        banco.agregarCuenta(cuenta);
                        System.out.println("Cuenta agregada correctamente.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        double cantidad = obtenerCantidad();
                        int noCuentaDeposito = obtenerNoCuenta();
                        CuentaBancaria cuentaDeposito = banco.buscarCuenta(noCuentaDeposito);

                        if (cuentaDeposito != null) {
                            cuentaDeposito.depositar(cantidad);
                            System.out.println("Depósito realizado correctamente.");
                        } else {
                            System.out.println("ERROR: No existe la cuenta. Busque o cree una cuenta.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        double cantidadRetiro = obtenerCantidad();
                        int noCuentaRetiro = obtenerNoCuenta();
                        CuentaBancaria cuentaRetiro = banco.buscarCuenta(noCuentaRetiro);

                        if (cuentaRetiro != null) {
                            cuentaRetiro.retirar(cantidadRetiro);
                            System.out.println("Retiro realizado correctamente.");
                        } else {
                            System.out.println("ERROR: No existe la cuenta. Busque o cree una cuenta.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    } catch (RuntimeException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("ERROR: Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close(); // Cerrar el escáner al finalizar
    }
}
