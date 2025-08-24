package org.example;

public class Mascota {
    private String id;
    private String nombre;
    private String edad;
    private String raza;

    public Mascota(String id, String nombre, String edad, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
