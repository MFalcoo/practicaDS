package domain.lugares;

import domain.viajes.Vuelo;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class Aeropuerto {

    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;

    public List<Vuelo> vuelosQueLlegaronElDia(LocalDate dia){
        //TODO
        return null;
    }

     public Integer cantVuelosQueLlegaronElDia(LocalDate dia){
         //TODO
         return 0;
     }

    public Integer cantVuelosQuePartieronElDia(LocalDate dia){
        //TODO
        return 0;
    }


}
