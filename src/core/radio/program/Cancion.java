/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.radio.program;

import core.person.Artista;
import core.radio.utils.Genero;

/**
 *
 * @author edangulo
 */
public class Cancion {
    
    private String nombre;
    private Artista artista;
    private Genero genero;

    public Cancion(String nombre, Artista artista, Genero genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        
        this.artista.addCancion(this);
    }

    public Artista getArtista() {
        return artista;
    }
    
}
