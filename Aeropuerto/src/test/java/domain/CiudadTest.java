package domain;

import domain.lugares.Aeropuerto;
import domain.lugares.Ciudad;
import org.junit.Assert;
import org.junit.Test;

public class CiudadTest {

    @Test
    public void ciudadTieneDosAeropuertos(){
        Ciudad unaCiudad= new Ciudad("Ezeiza");
        Aeropuerto unAeropuerto = new Aeropuerto();

        unaCiudad.agregarAeropuertos(unAeropuerto);

        Assert.assertEquals(2,unaCiudad.cantDeAeropuertos().intValue());
    }
}
