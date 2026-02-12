package uniquindio.edu.co.model;

import java.util.Scanner;

public class Articulo {
    public static void main(String[] args) {
      double precio = ingresarDecimalPositivo ("Ingrese el precio del articulo: ",0);
      int cantidad = ingresarEnteroPositivo ("Ingrese la cantidad de articulos que lleva el cliente: ",1);
      double total = calcularTotal(precio,cantidad);
      String mensaje = generarMensaje(precio,cantidad,total);
      mostrarMensaje (mensaje);
    }

    public static double calcularTotal(double precio,int cantidad){
        double precioTotal = precio*cantidad;
        return precioTotal;
    }

    public static String generarMensaje(double precio,int cantidad,double total){
        String mensaje = "El precio del articulo es: " + precio+"\n"+ "La cantidad de articulos es: " + cantidad + "\n" + "El total a pagar es: "+total;
        return mensaje;
    }

    static double ingresarDecimalPositivo(String mensaje, double valorMinimo) {
        double valor=0;
        boolean repetir = true;
        while (repetir) {
            valor = ingresarDecimal(mensaje);
            if (valor <= valorMinimo) {
                System.out.println("El valor no es mayor que "+valorMinimo);
            } else {
                repetir = false;
            }
        }
        return valor;
    }
    public static double ingresarDecimal (String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.print(mensaje);
        double decimal= scanner.nextDouble();
        return decimal;
    }

     public static int ingresarEnteroPositivo(String mensaje, int valorMinimo) {
        int valor=0;
        boolean repetir = true;
        while (repetir) {
            valor = ingresarEntero(mensaje);
            if (valor < valorMinimo) {
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

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}
