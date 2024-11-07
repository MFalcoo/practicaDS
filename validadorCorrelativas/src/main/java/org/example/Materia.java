package org.example;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> materiasNecesarias;


    public Materia(String nombre, List<Materia> materiasNecesarias){
        this.materiasNecesarias = materiasNecesarias;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasNecesarias() {
        return materiasNecesarias;
    }

    public void setMateriasNecesarias(List<Materia> materiasNecesarias) {
        this.materiasNecesarias = materiasNecesarias;
    }

}
