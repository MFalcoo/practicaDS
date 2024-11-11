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

  //NO ANDA
//
//  @Convert(converter = ElementosAttributeConverter.class)
//  @ManyToMany
//  @JoinTable(
//          name = "personaje_elemento",
//          joinColumns = @JoinColumn(name = "personaje_id",
//                  referencedColumnName = "id"),
//          inverseJoinColumns = @JoinColumn(name = "elemento_id", referencedColumnName = "id")
//  )
//  @Getter @Setter
//  private List<ElementoDefensor> elementos;

  @OneToMany(mappedBy = "personaje")
  @Getter @Setter
  private List<ElementosPersonajes> elementos;


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

  public void agregarElemento(ElementosPersonajes elemento){
    this.elementos.add(elemento);
  }

}