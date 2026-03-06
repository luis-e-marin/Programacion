package uniquindio.edu.co.model;

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

    public String generarMensaje(){
        return "Pago | Fecha: " + fecha +
                " | Valor: " + valor +
                " | Método: " + metodo;
    }
}