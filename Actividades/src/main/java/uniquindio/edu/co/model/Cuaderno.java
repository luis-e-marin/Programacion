package uniquindio.edu.co.model;

import java.util.Scanner;

public class Cuaderno {

        public static void main(String[] args) {
            int lado = ingresarEntero("Ingrese el lado del cuadrado: ");
            int perimetro = calcularPerimetro(lado);
            String mensaje = generarMensaje(perimetro);
            mostrarMensaje(mensaje);

        }

    public static int calcularPerimetro(int lado) {
        int perimetro = 4 * lado;
        return perimetro;
    }

    public static int ingresarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int entero = scanner.nextInt();
        return entero;
    }

    public static String generarMensaje(int perimetro) {
        return "El perímetro del cuadrado es: " + perimetro;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}