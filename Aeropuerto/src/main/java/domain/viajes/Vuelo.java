package domain.viajes;

import domain.lugares.Aeropuerto;
import domain.lugares.Ciudad;
import domain.personas.Pasajero;
import domain.personas.Tripulacion;

import javax.swing.event.InternalFrameEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {

    private Aeropuerto origen;
    private Aeropuerto destino;
    private LocalDateTime fechaHoraq;
    private Double duracionEstimadaEnMins;
    private Avion avion;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

    public Integer cantPasajeros(){
        return this.pasajeros.size();
    }

    public Double capacidadRealOcupadaPorPasajeros(){
        return ((this.cantPasajeros()) * 100.00) / this.avion.getCantAsientos();
    }


    public boolean tuDestinoEs(Ciudad unaCiudad){
        return true;
    }


}
