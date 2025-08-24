package org.example;

public class Veterinario {
    private String nombre;
    private String cedula;

    public Veterinario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public String getId(){
        return cedula;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
