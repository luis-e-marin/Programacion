package uniquindio.edu.co.model;

import java.util.ArrayList;

public class Socio {

    private String nombre;
    private String id;
    private Membresia membresia;
    private ClaseGrupal clase;
    private ArrayList<Pago> pagos;

    public Socio(String nombre, String id, Membresia membresia) {
        this.nombre = nombre;
        this.id = id;
        this.membresia = membresia;
        this.pagos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setClase(ClaseGrupal clase) {
        this.clase = clase;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public String generarMensaje(){

        String info = "Socio: " + nombre +
                " | Membresía: " + membresia.getTipo();

        if(clase != null){
            info += " | Clase: " + clase.getNombre();
        }

        return info;
    }
}