package Gym.uniquindio.edu.co.model;

import Gym.uniquindio.edu.co.model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Socio> socios = new ArrayList<>();
    static ArrayList<Entrenador> entrenadores = new ArrayList<>();
    static ArrayList<ClaseGrupal> clases = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GIMNASIO ---");
            System.out.println("1. Registrar socio");
            System.out.println("2. Registrar entrenador y clase");
            System.out.println("3. Reservar clase");
            System.out.println("4. Registrar pago");
            System.out.println("5. Ver socios con membresia vencida");
            System.out.println("6. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> registrarSocio(sc);
                case 2 -> registrarEntrenadorYClase(sc);
                case 3 -> reservarClase(sc);
                case 4 -> registrarPago(sc);
                case 5 -> verSociosVencidos();
            }

        } while (opcion != 6);
    }

    static void registrarSocio(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Documento: ");
        String doc = sc.nextLine();

        Membresia m = new Membresia("Mensual",
                LocalDate.now(),
                LocalDate.now().plusMonths(1),
                80000);

        socios.add(new Socio(nombre, doc, m));
        System.out.println("Socio registrado.");
    }

    static void registrarEntrenadorYClase(Scanner sc) {
        System.out.print("Nombre entrenador: ");
        String nombre = sc.nextLine();

        Entrenador e = new Entrenador(nombre);
        entrenadores.add(e);

        System.out.print("Nombre clase: ");
        String claseNombre = sc.nextLine();

        ClaseGrupal c = new ClaseGrupal(claseNombre, 10, "6:00 PM");
        clases.add(c);
        e.agregarClase(c);

        System.out.println("Entrenador y clase registrados.");
    }

    static void reservarClase(Scanner sc) {
        if (socios.isEmpty() || clases.isEmpty()) {
            System.out.println("Debe haber socios y clases.");
            return;
        }

        Socio socio = socios.get(0);
        ClaseGrupal clase = clases.get(0);

        if (clase.reservar(socio)) {
            System.out.println("Reserva realizada.");
        } else {
            System.out.println("No hay cupo disponible.");
        }
    }

    static void registrarPago(Scanner sc) {
        if (socios.isEmpty()) return;

        Socio socio = socios.get(0);

        socio.agregarPago(new Pago(LocalDate.now(), 80000, "Efectivo"));
        System.out.println("Pago registrado.");
    }

    static void verSociosVencidos() {
        for (Socio s : socios) {
            if (s.membresiaVencida()) {
                System.out.println(s.getNombre() + " tiene membresia vencida.");
            }
        }
    }
}