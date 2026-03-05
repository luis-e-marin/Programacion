package uniquindio.edu.co.model;

import java.util.ArrayList;

public class Entrenador {
    private String nombre;
    private ArrayList<ClaseGrupal> clases;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.clases = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<ClaseGrupal> getClases() {
        return clases;
    }
}