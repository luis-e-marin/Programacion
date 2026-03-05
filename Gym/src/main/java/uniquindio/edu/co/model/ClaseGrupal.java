package uniquindio.edu.co.model;

import java.util.ArrayList;

public class ClaseGrupal {

    private String nombre;
    private int cupoMaximo;
    private String horario;
    private Entrenador entrenador;
    private ArrayList<Socio> socios;

    public ClaseGrupal(String nombre, int cupoMaximo, String horario, Entrenador entrenador) {
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.horario = horario;
        this.entrenador = entrenador;
        this.socios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public boolean hayCupo(){
        return socios.size() < cupoMaximo;
    }

    public String mostrarInfo(){
        return nombre + " | Horario: " + horario +
                " | Cupo: " + socios.size() + "/" + cupoMaximo +
                " | Entrenador: " + entrenador.getNombre();
    }
}