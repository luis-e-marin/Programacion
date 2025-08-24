package org.example;

public class Propietario {
    private String nombre;
    private String id;
    private String telefono;
    private String email;

    public Propietario(String nombre, String id, String telefono, String email) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.email = email;
    }
    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
