package uniquindio.edu.co.model;

import java.util.Scanner;

public class SumaPromedio {
    public static void main (String[]args){
        int numero1 = ingresarEntero("ingrese el primer numero: ");
        int numero2 = ingresarEntero("ingrese el segundo numero: ");
        int numero3 = ingresarEntero("ingrese el tercer numero: ");
        int numero4 = ingresarEntero("ingrese el cuarto numero: ");
        int suma = calcularSuma(numero1,numero2,numero3,numero4);
        double promedio = calcularPromedio(suma);
        String mensaje = generarMensaje(suma,promedio);
        mostrarMensaje (mensaje);
    }

    public static int calcularSuma(int numero1,int numero2,int numero3,int numero4){
        int suma = 0;
        suma = numero1+numero2+numero3+numero4;
        return suma;
    }

    public static double calcularPromedio(int suma){
        double promedio = 0;
        promedio = suma / 4.0;
        return promedio;
    }

    public static String generarMensaje(int suma,double promedio){
        String mensaje = (" la suma de los numeros ingresados es: " + suma + "\n"+ "El promedio de la suma de los numeros ingresados es: " + promedio);
        return mensaje;
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
