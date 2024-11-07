package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ejercicio")
@Getter
@Setter
public class Ejercicio {
    @Id
    @GeneratedValue;
    private Long id;
    @Column
    private String nombre;
    @Column
    private String detalle;
}
