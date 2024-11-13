package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "personaje")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo")
public class Personaje {

  @Id
  @GeneratedValue
  private Long id;

  @ElementCollection
  @CollectionTable (name = "elementos",joinColumns = @JoinColumn(name = "personaje_id"))
  @Convert(converter = ElementosAttributeConverter.class)
  @Getter @Setter
  private List<ElementoDefensor> elementos;

  // private List<String> elementos;

  @Column(name = "estamina")
  @Getter @Setter
  private Integer estamina;

  @Column(name = "vida")
  @Getter @Setter
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
    //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}