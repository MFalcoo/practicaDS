package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "deportista")
@Getter
@Setter
public class Deportista {
    @Id
    @GeneratedValue;
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column
    private String apellido;

    @ElementCollection
    @CollectionTable(name = "contactosDeportista",joinColumns = @JoinColumn(name = "deportista_id"))
    @Column
    private List<String> contactos;

    @Convert(converter = MotivacionAttributeConverter.class)
    @Column(name = "motivacion")
    private Motivacion motivacionPrincipal;

    @Column
    private Double pesoInicialEnKilos;


    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista(){
        this.contactos = new ArrayList<>();
    }

}
