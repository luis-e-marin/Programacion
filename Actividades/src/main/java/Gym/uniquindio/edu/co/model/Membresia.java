package Gym.uniquindio.edu.co.model;

import java.time.LocalDate;

public class Membresia {

    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

    public Membresia(String tipo, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public boolean estaVencida() {
        return LocalDate.now().isAfter(fechaFin);
    }

    public boolean proximaAVencer() {
        return LocalDate.now().plusDays(5).isAfter(fechaFin);
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
}
