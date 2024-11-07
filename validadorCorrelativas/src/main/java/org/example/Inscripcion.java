package org.example;

import java.util.List;

class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, List<Materia> materias){
        this.alumno= alumno;
        this.materias = materias;
    }

    public boolean aprobada(){
        //preguntamos para todas las materias en las q se quiere inscribir
        for (Materia materia : materias){
            //creamos lista de materias necesarias para cursar la materia en cuestion
            List<Materia> materiasNecesarias = materia.getMateriasNecesarias();
            //para cada una de las materias necesarias
            for (Materia materiaNecesaria : materiasNecesarias){
                //preguntamos si las materias aprobadas del alumno contiene esa materia necesaria
                if(!alumno.getMateriasAprobadas().contains(materiaNecesaria)){
                    return false;   //si la tiene cago
                } // si no la tiene pregunta en la siguiente
            }
        }
        return true;
    }
}

