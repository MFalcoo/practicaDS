package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.pruebaDS.ejercicio_02.elementos.ElementoDefensor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "elemento_personaje")
public class ElementosPersonajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Convert(converter = ElementosAttributeConverter.class)
    @ManyToOne
    private ElementoDefensor elemento;
    @ManyToOne
    private Personaje personaje;


}
