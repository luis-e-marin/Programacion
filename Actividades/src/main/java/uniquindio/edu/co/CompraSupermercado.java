package uniquindio.edu.co;

import java.util.Scanner;

public class CompraSupermercado {
    public static void main(String[] args) {
        double presupuestoMax = 100;
        double vegetariano = ingresarDecimalPositivo("Ingrese el valor de los productos vegetarianos: ", 0);
        double sinGluten = ingresarDecimalPositivo("Ingrese el valor de los productos sin gluten: ", 0);
        double snacks = ingresarDecimalPositivo("Ingrese el valor de los snacks para los niños: ", 0);
        CompraSupermercado compra = new CompraSupermercado(presupuestoMax, vegetariano, sinGluten, snacks);
        double total = compra.calcularTotal();
        String mensaje = compra.generarMensaje(total);
        mostrarMensaje(mensaje);
    }
    // Atributos
    private double presupuestoMax;
    private double vegetariano;
    private double sinGluten;
    private double snacks;

    // Constructor
    public CompraSupermercado(double presupuestoMax, double vegetariano, double sinGluten, double snacks) {
        this.presupuestoMax = presupuestoMax;
        this.vegetariano = vegetariano;
        this.sinGluten = sinGluten;
        this.snacks = snacks;
    }


    // Métodos de instancia
    public double calcularTotal() {
        return vegetariano + sinGluten + snacks;
    }

    public String generarMensaje(double total) {

        String mensaje = "RESUMEN DE LA COMPRA\n";
        mensaje += "Vegetariano: " + vegetariano + " €\n";
        mensaje += "Sin gluten: " + sinGluten + " €\n";
        mensaje += "Snacks niños: " + snacks + " €\n";
        mensaje += "TOTAL: " + total + " €\n";

        if (total <= presupuestoMax) {
            mensaje += "La compra está dentro del presupuesto.\n";
            mensaje += "Ruta por secciones para ahorrar tiempo.";
        } else {
            mensaje += "La compra supera el presupuesto de 100 €.";
        }

        return mensaje;
    }

    // Métodos estáticos de entrada/salida
    static double ingresarDecimalPositivo(String mensaje, double valorMinimo) {
        double valor = 0;
        boolean repetir = true;

        while (repetir) {
            valor = ingresarDecimal(mensaje);
            if (valor <= valorMinimo) {
                System.out.println("El valor debe ser mayor que " + valorMinimo);
            } else {
                repetir = false;
            }
        }
        return valor;
    }

    static double ingresarDecimal(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
