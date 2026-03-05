package Gym.uniquindio.edu.co.model;

import java.util.ArrayList;

public class ClaseGrupal {

    private String nombre;
    private int cupoMaximo;
    private String horario;
    private ArrayList<Socio> reservas;

    public ClaseGrupal(String nombre, int cupoMaximo, String horario) {
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.horario = horario;
        this.reservas = new ArrayList<>();
    }

    public boolean reservar(Socio socio) {
        if (reservas.size() < cupoMaximo) {
            reservas.add(socio);
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarReservas() {
        for (Socio socio : reservas) {
            System.out.println(socio.getNombre());
        }
    }
}
