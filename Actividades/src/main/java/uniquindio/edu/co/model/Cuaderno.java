package uniquindio.edu.co.model;

import java.util.Scanner;

public class Cuaderno {

        public static void main(String[] args) {
            int lado = ingresarEnteroPositivo("Ingrese el lado del cuaderno: ",0);
            int perimetro = calcularPerimetro(lado);
            String mensaje = generarMensaje(perimetro);
            mostrarMensaje(mensaje);

        }

    public static int calcularPerimetro(int lado) {
        int perimetro = 4 * lado;
        return perimetro;
    }

    static int ingresarEnteroPositivo(String mensaje, int valorMinimo) {
        int valor=0;
        boolean repetir = true;
        while (repetir) {
            valor = ingresarEntero(mensaje);
            if (valor <= valorMinimo) {
                System.out.println("El valor no es mayor que "+valorMinimo);
            } else {
                repetir = false;
            }
        }
        return valor;
    }
    public static int ingresarEntero (String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.print(mensaje);
        int entero= scanner.nextInt();
        return entero;
    }

    public static String generarMensaje(int perimetro) {
        return "El perímetro del cuaderno es: " + perimetro;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}