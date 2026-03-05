package Gym.uniquindio.edu.co.model;

import java.util.ArrayList;

public class Socio {

    private String nombre;
    private String documento;
    private Membresia membresia;
    private ArrayList<Pago> pagos;

    public Socio(String nombre, String documento, Membresia membresia) {
        this.nombre = nombre;
        this.documento = documento;
        this.membresia = membresia;
        this.pagos = new ArrayList<>();
    }

    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

    public boolean membresiaVencida() {
        return membresia.estaVencida();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void mostrarPagos() {
        for (Pago pago : pagos) {
            System.out.println(pago);
        }
    }
}