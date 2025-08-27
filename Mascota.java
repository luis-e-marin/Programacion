package org.example;

public class Mascota {
    private int id;
    private String nombre;
    private int edad;
    private String raza;

    public Mascota(int id, String nombre, int edad, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    public int getId(){

        return id;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
