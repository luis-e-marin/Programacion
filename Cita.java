package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cita {
    private LocalDate fecha;
    private int id;
    private String lugar;
    private List<Mascota> listMascotas;
    private Propietario propietario;
    private Veterinario veterinario;

    public Cita(LocalDate fecha, int id, String lugar, Propietario propietario, Veterinario veterinario) {
        this.fecha = fecha;
        this.id = id;
        this.lugar = lugar;
        this.propietario = propietario;
        this.veterinario = veterinario;
        this.listMascotas = new ArrayList<>();
    }

    public boolean verificarMascota(Mascota mascota) {
        for (Mascota est : listMascotas) {
            if (est.getId() == mascota.getId()) {
                return true;
            }
        }
        return false;
    }

    public void agregarMascotaALaCita(Mascota mascota, Mascota mascota2){
        if(!verificarMascota(mascota)){
            listMascotas.add(mascota);
            System.out.println("Se agrego");
        }else{
            System.out.println("Ya existe");
        }
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha:" + fecha +
                ", id='" + id + '\'' +
                ", lugar:'" + lugar + '\'' +
                ", listMascotas=" + listMascotas +
                ", propietario=" + propietario +
                ", veterinario=" + veterinario +
                '}';
    }
}
