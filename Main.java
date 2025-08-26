package org.example;
import org.example.Propietario;
import org.example.Cita;
import org.example.Veterinario;
import org.example.Mascota;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        // Creamos Propietario
        Propietario propietario = new Propietario("Jose", "1850478", "015478932", "perez@gmail.com");

        // Creamos Veterinario
        Veterinario veterinario = new Veterinario("Luis", "123");

        // Creamos fecha personalizada (28 de mayo de 2025)
        LocalDate fecha = LocalDate.of(2025, 5, 28);

        // Creamos Cita con la fecha personalizada
        Cita cita = new Cita(fecha, 12356,"Calarca", propietario, veterinario);
        Cita cita1= new Cita(fecha, 12356,"Calarca", propietario, veterinario);

        // Creamos Mascota
        Mascota mascota = new Mascota(254136, "Pinta", 2, "Gato");
        Mascota mascota2=new Mascota(254136, "roger", 3, "perro");

        // Agregamos Mascota a la Cita
        cita.agregarMascotaALaCita(mascota,mascota2);


        // Mostramos la cita
        System.out.println(cita.toString());
     }
}