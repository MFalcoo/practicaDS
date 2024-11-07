package domain.lugares;

import domain.viajes.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ciudad {
    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.aeropuertos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }


    public void agregarAeropuertos(Aeropuerto ... aeropuertos){
        Collections.addAll(this.aeropuertos,aeropuertos);
    }

    public Integer cantPasajerosQueLlegaronElDia (LocalDate unDia){
        List<Vuelo> vuelosQueLlegaronEseDia = this.aeropuertos
                .stream()
                .flatMap(a-> a.vuelosQueLlegaronElDia(unDia).stream())
                .collect(Collectors.toList()); //transforma stream en una List
        return vuelosQueLlegaronEseDia // coleccion de vuelos
                .stream()
                .mapToInt(Vuelo::cantPasajeros)//transformo el objeto vuelo en la cantidad de sus pasajeros (atributo de la clase)
                .sum();// sumo todos los pasajeros de todos los vuelos
    }

    public Integer cantDeAeropuertos() {
        return this.aeropuertos.size();
    }
}
