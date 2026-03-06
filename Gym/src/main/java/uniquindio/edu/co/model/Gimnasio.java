package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Gimnasio {

    ArrayList<Socio> socios = new ArrayList<>();
    ArrayList<Entrenador> entrenadores = new ArrayList<>();
    ArrayList<ClaseGrupal> clases = new ArrayList<>();

    public static void main(String[] args) {

        Gimnasio sistema = new Gimnasio();
        sistema.iniciarSistema();

    }

    public void iniciarSistema() {

        int opcion;

        do {

            mostrarMenu();
            opcion = ingresarEntero("Seleccione una opción: ");

            switch (opcion) {

                case 1:
                    agregarSocio();
                    break;

                case 2:
                    agregarEntrenador();
                    break;

                case 3:
                    crearClase();
                    break;

                case 4:
                    verSocios();
                    break;

                case 5:
                    verEntrenadores();
                    break;

                case 6:
                    verClases();
                    break;

                case 7:
                    reservarClase();
                    break;

                case 8:
                    mostrarMensaje("Saliendo del sistema...");
                    break;

                default:
                    mostrarMensaje("Opción inválida");

            }

        } while (opcion != 8);

    }

    public void mostrarMenu() {

        mostrarMensaje("\n----- GIMNASIO -----");
        mostrarMensaje("1. Agregar socio");
        mostrarMensaje("2. Agregar entrenador");
        mostrarMensaje("3. Crear clase grupal");
        mostrarMensaje("4. Ver socios");
        mostrarMensaje("5. Ver entrenadores");
        mostrarMensaje("6. Ver clases");
        mostrarMensaje("7. Reservar clase");
        mostrarMensaje("8. Salir");

    }

    public void agregarSocio() {

        String nombre = ingresarTexto("Nombre del socio: ");
        String id = ingresarTexto("ID del socio: ");
        String tipo = ingresarTexto("Tipo de membresía: ");
        double precio = ingresarDecimal("Precio membresía: ");

        Membresia membresia = new Membresia(
                tipo,
                LocalDate.now(),
                LocalDate.now().plusMonths(1),
                precio
        );

        Socio socio = new Socio(nombre, id, membresia);

        socios.add(socio);

        mostrarMensaje("Socio registrado correctamente");

    }

    public void agregarEntrenador() {

        String nombre = ingresarTexto("Nombre del entrenador: ");

        Entrenador entrenador = new Entrenador(nombre);
        entrenadores.add(entrenador);

        mostrarMensaje("Entrenador registrado");

    }

    public void crearClase() {

        String nombre = ingresarTexto("Nombre de la clase: ");
        String horario = ingresarTexto("Horario de la clase: ");
        int cupo = ingresarEntero("Cupo máximo: ");

        verEntrenadores();
        int index = ingresarEntero("Seleccione entrenador: ");

        Entrenador entrenador = entrenadores.get(index);

        ClaseGrupal clase = new ClaseGrupal(nombre, cupo, horario, entrenador);

        clases.add(clase);

        mostrarMensaje("Clase creada correctamente");

    }

    public void verSocios() {

        for (int i = 0; i < socios.size(); i++) {

            mostrarMensaje(i + " - " + socios.get(i).generarMensaje());

        }

    }

    public void verEntrenadores() {

        for (int i = 0; i < entrenadores.size(); i++) {

            mostrarMensaje(i + " - " + entrenadores.get(i).generarMensaje());

        }

    }

    public void verClases() {

        for (int i = 0; i < clases.size(); i++) {

            mostrarMensaje(i + " - " + clases.get(i).generarMensaje());

        }

    }

    public void reservarClase() {

        verSocios();
        int socioIndex = ingresarEntero("Seleccione socio: ");
        Socio socio = socios.get(socioIndex);

        verClases();
        int claseIndex = ingresarEntero("Seleccione clase: ");
        ClaseGrupal clase = clases.get(claseIndex);

        if (clase.agregarSocio(socio)) {

            mostrarMensaje("Reserva realizada para " + socio.getNombre());

        } else {

            mostrarMensaje("No hay cupos disponibles");

        }

    }

    // =========================
    // MÉTODOS DE ENTRADA
    // =========================

    public static String ingresarTexto(String mensaje) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();

    }

    public static int ingresarEntero(String mensaje) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();

    }

    public static double ingresarDecimal(String mensaje) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();

    }

    public static void mostrarMensaje(String mensaje) {

        System.out.println(mensaje);

    }

}