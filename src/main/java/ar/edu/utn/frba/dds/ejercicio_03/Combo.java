package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("combo")
public class Combo extends Producto{

  @ManyToMany
  @JoinTable(
          name = "combo_producto",
          joinColumns = @JoinColumn(name = "combo_id",referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "producto_id",referencedColumnName = "id")
  )
  @Getter @Setter
  private List<Producto> productos;

  public Combo(){
      this.productos = new ArrayList<Producto>();
  }

  public void agregarProducto(Producto producto){
    this.productos.add(producto);
  }

  public Double precio(){
    return this.productos.stream().mapToDouble(p-> p.precio()).sum();
  }
}
