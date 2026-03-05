package Gym.uniquindio.edu.co.model;

import java.util.ArrayList;

public class Entrenador {

    private String nombre;
    private ArrayList<ClaseGrupal> clases;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.clases = new ArrayList<>();
    }

    public void agregarClase(ClaseGrupal clase) {
        clases.add(clase);
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarClases() {
        for (ClaseGrupal claseGrupal : clases) {
            System.out.println(claseGrupal.getNombre());
        }
    }
}