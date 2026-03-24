package uniquindio.edu.co.model;

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

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public double getPrecio() {
        return precio;
    }
}
