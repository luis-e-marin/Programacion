package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Socio> socios = new ArrayList<>();
    static ArrayList<Entrenador> entrenadores = new ArrayList<>();
    static ArrayList<ClaseGrupal> clases = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = ingresarEntero("Seleccione una opcion: ");
            switch (opcion){
                case 1 -> registrarSocio();
                case 2 -> registrarEntrenador();
                case 3 -> crearClase();
                case 4 -> reservarClase();
                case 5 -> verSocios();
                case 6 -> verEntrenadores();
                case 7 -> verClases();
                case 8 -> verReservas();
            }
        }while(opcion != 9);
    }

    public static void mostrarMenu(){
        mostrarMensaje("""
        ----- GIMNASIO -----
        1. Registrar socio
        2. Registrar entrenador
        3. Crear clase grupal
        4. Reservar clase
        5. Ver socios
        6. Ver entrenadores
        7. Ver clases
        8. Ver reservas por clase
        9. Salir
        """);
    }

    public static void registrarSocio(){
        String nombre = ingresarTexto("Nombre: ");
        String id = ingresarTexto("Documento: ");
        String tipo = ingresarTexto("Tipo de membresia: ");
        double precio = ingresarDecimal("Precio membresia: ");
        int meses = ingresarEntero("Duracion en meses: ");
        LocalDate inicio = LocalDate.now();
        LocalDate fin = inicio.plusMonths(meses);
        Membresia membresia = new Membresia(tipo,inicio,fin,precio);
        Socio socio = new Socio(nombre,id,membresia);
        socios.add(socio);
        registrarPago(socio,precio);
        mostrarMensaje("Socio registrado correctamente");
    }

    public static void registrarPago(Socio socio,double valor){
        String metodo = ingresarTexto("Metodo de pago: ");
        Pago pago = new Pago(LocalDate.now(),valor,metodo);
        socio.getPagos().add(pago);
    }

    public static void registrarEntrenador(){
        String nombre = ingresarTexto("Nombre del entrenador: ");
        entrenadores.add(new Entrenador(nombre));
        mostrarMensaje("Entrenador registrado");
    }

    public static void crearClase(){
        String nombre = ingresarTexto("Nombre de la clase: ");
        int cupo = ingresarEntero("Cupo maximo: ");
        String horario = ingresarTexto("Horario: ");

        verEntrenadores();
        int entrenadorIndex = ingresarEntero("Seleccione entrenador: ");
        Entrenador entrenador = entrenadores.get(entrenadorIndex);
        ClaseGrupal clase = new ClaseGrupal(nombre,cupo,horario,entrenador);
        clases.add(clase);
        entrenador.getClases().add(clase);
        mostrarMensaje("Clase creada");

    }

    public static void reservarClase(){
        verSocios();
        int socioIndex = ingresarEntero("Seleccione socio: ");
        Socio socio = socios.get(socioIndex);

        verClases();
        int claseIndex = ingresarEntero("Seleccione clase: ");
        ClaseGrupal clase = clases.get(claseIndex);
        if(clase.hayCupo()){
            clase.getSocios().add(socio);
            socio.setClase(clase);
            mostrarMensaje("Reserva realizada");
        }else{
            mostrarMensaje("No hay cupos disponibles");
        }
    }

    public static void verSocios(){
        for(int i=0;i<socios.size();i++){
            mostrarMensaje(i + " - " + socios.get(i).mostrarInfo());
        }
    }

    public static void verEntrenadores(){
        for(int i=0;i<entrenadores.size();i++){
            mostrarMensaje(i + " - " + entrenadores.get(i).getNombre());
        }
    }

    public static void verClases(){
        for(int i=0;i<clases.size();i++){
            mostrarMensaje(i + " - " + clases.get(i).mostrarInfo());
        }
    }

    public static void verReservas(){
        for(ClaseGrupal claseGrupal : clases){
            mostrarMensaje("\nClase: " + claseGrupal.getNombre());
            for(Socio socio : claseGrupal.getSocios()){
                mostrarMensaje(" - " + socio.getNombre());
            }
        }
    }

    public static String ingresarTexto (String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.print(mensaje);
        String texto= scanner.nextLine();
        return texto;
    }

    public static int ingresarEntero (String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.print(mensaje);
        int entero= scanner.nextInt();
        return entero;
    }

    public static double ingresarDecimal (String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.print(mensaje);
        double decimal= scanner.nextDouble();
        return decimal;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}