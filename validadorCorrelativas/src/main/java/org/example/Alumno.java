package org.example;

import java.util.List;

public class Alumno {
    private int legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(int legajo,List<Materia> materiasAprobadas){
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
