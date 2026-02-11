package uniquindio.edu.co.model;

import java.util.Scanner;

import static uniquindio.edu.co.model.Cuaderno.generarMensaje;

public class Producto {
    public static  void main(String []args) {
        int numero1 = ingresarEntero("ingrese el primer numero a sumar : ");
        int numero2 = ingresarEntero("ingrese el segundo numero  a sumar : ");
        int numero3 = ingresarEntero("ingrese el  numero del producto : ");
        int numero4 = ingresarEntero("ingrese el  numero del producto: ");
        int suma = calcularSuma(numero1,numero2);
        int producto = calcularProducto(numero3,numero4);
        String mensaje = generarMensaje(suma,producto,numero1,numero2,numero3,numero4);
        mostrarMensaje(mensaje);
    }

    public static int calcularSuma(int numero1, int numero2) {
        int suma = 0;
        suma = numero1 + numero2;
        return suma;
    }

    public static int calcularProducto(int numero3,int numero4){
        int producto = 0;
        producto = numero3*numero4;
        return producto;
    }

    public static String generarMensaje(int suma,int producto,int numero1,int numero2,int numero3,int numero4){
        String mensaje= ("la suma de : "+ numero1 +" + "+numero2+" es igual a : "+suma+ "\n"+"El producto de; "+numero3+" * "+numero4+" es igual a : "+producto);
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
