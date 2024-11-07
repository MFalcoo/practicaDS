package domain.catalogo;

import domain.tendencias.Popularidad;
import domain.tendencias.Normal;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class Cancion {
    @Setter @Getter private String titulo;

    @Setter @Getter private Artista artista;

    @Setter @Getter private Album album;

    @Setter @Getter private Integer anio;

    @Setter @Getter private Integer cantLikes;

    @Setter @Getter private Integer cantDislikes;

    @Getter private Integer cantReproducciones;

    @Getter @Setter private Popularidad popularidad;

    @Getter private LocalDateTime ultVezEscuchada;

    public Cancion() {
        this.cantReproducciones = 0;
        this.cantLikes = 0;
        this.cantDislikes = 0;
        this.popularidad = new Normal(this.cantReproducciones);
    }

    public String detalleCompleto() {
        return this.popularidad.detalle(this);
    }

    public void reproducir() {
        this.cantReproducciones++;
        this.popularidad.reproducir(this);
        this.ultVezEscuchada = LocalDateTime.now();
    }

    public void recibirLike() {
        this.cantLikes++;
    }

    public void recibirDislike() {
        this.cantDislikes++;
        this.popularidad.recibirDislike();
    }

    public String serEscuchada() {
        this.reproducir();
        return this.detalleCompleto();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getCantLikes() {
        return cantLikes;
    }

    public void setCantLikes(Integer cantLikes) {
        this.cantLikes = cantLikes;
    }

    public Integer getCantDislikes() {
        return cantDislikes;
    }

    public void setCantDislikes(Integer cantDislikes) {
        this.cantDislikes = cantDislikes;
    }

    public Integer getCantReproducciones() {
        return cantReproducciones;
    }

    public void setCantReproducciones(Integer cantReproducciones) {
        this.cantReproducciones = cantReproducciones;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public LocalDateTime getUltVezEscuchada() {
        return ultVezEscuchada;
    }

    public void setUltVezEscuchada(LocalDateTime ultVezEscuchada) {
        this.ultVezEscuchada = ultVezEscuchada;
    }
}
