package domain.catalogo;

import lombok.Getter;
import lombok.Setter;

public class Album {
    @Setter @Getter private Integer anio;
    @Setter @Getter private String nombre;

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
