package domain.catalogo;

import lombok.Getter;
import lombok.Setter;

public class Artista {
    @Setter @Getter private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
