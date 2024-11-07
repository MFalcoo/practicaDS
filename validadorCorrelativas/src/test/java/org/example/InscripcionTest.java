package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InscripcionTest {

    @Test
    public void validarInscripcionMarco(){
        //Instancia Materias
        Materia pdp = new Materia("Pdp",  Arrays.asList());
        Materia AyE = new Materia("AyE",  Arrays.asList(pdp));
        Materia disenio = new Materia("Diseño", Arrays.asList(pdp, AyE));

        Alumno marco = new Alumno(12345, Arrays.asList(pdp,AyE));

        //Creo lista de objetos (materias)
        List<Materia> materiasInscripcion = Arrays.asList(disenio);

        //Instancia de inscripcion
        Inscripcion unaInscripcion = new Inscripcion(marco, materiasInscripcion);

        Assert.assertEquals(true,unaInscripcion.aprobada());

    }

    @Test
    public void validarInscripcionBelen(){
        //Instancia Materias
        Materia pdp = new Materia("Pdp",  Arrays.asList());
        Materia AyE = new Materia("AyE",  Arrays.asList(pdp));
        Materia disenio = new Materia("Diseño", Arrays.asList(pdp, AyE));

        Alumno belen = new Alumno(12346, Arrays.asList(AyE));

        //Creo lista de objetos (materias)
        List<Materia> materiasInscripcion = Arrays.asList(disenio);

        //Instancia de inscripcion
        Inscripcion unaInscripcion = new Inscripcion(belen, materiasInscripcion);

        Assert.assertEquals(false,unaInscripcion.aprobada());

    }
}
