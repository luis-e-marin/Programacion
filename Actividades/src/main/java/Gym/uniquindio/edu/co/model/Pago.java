package Gym.uniquindio.edu.co.model;

import java.time.LocalDate;

public class Pago {

    private LocalDate fecha;
    private double valor;
    private String metodo;

    public Pago(LocalDate fecha, double valor, String metodo) {
        this.fecha = fecha;
        this.valor = valor;
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + " | Valor: " + valor + " | Metodo: " + metodo;
    }
}