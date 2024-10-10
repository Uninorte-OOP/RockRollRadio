/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.radio;

import core.person.Artista;
import core.person.Invitado;
import core.person.Locutor;
import core.radio.program.Cancion;
import core.radio.program.Emision;
import core.radio.program.Programa;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author edangulo
 */
public class RockRollRadio {
    
    private ArrayList<Artista> artistas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;

    public RockRollRadio() {
        this.artistas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public Artista getArtista(int index) {
        return this.artistas.get(index);
    }
    
    public Cancion getCancion(int index) {
        return this.canciones.get(index);
    }
    
    public Locutor getLocutor(int index) {
        return this.locutores.get(index);
    }
    
    public Programa getPrograma(int index) {
        return this.programas.get(index);
    }
    
    public boolean addArtista(Artista artista) {
        if (!this.artistas.contains(artista)) {
            this.artistas.add(artista);
            return true;
        }
        return false;
    }
    
    public boolean addCancion(Cancion cancion) {
        if (!this.canciones.contains(cancion)) {
            this.canciones.add(cancion);
            return true;
        }
        return false;
    }
    
    public boolean addEmision(Emision emision) {
        return true;
    }
    
    public boolean addInvitado(Invitado invitado, Emision emision) {
        if (!this.invitados.contains(invitado)) {
            this.invitados.add(invitado);
            invitado.addEmision(emision);
            emision.addInvitado(invitado);
            return true;
        }
        return false;
    }
    
    public boolean addLocutor(Locutor locutor) {
        if (!this.locutores.contains(locutor)) {
            this.locutores.add(locutor);
            return true;
        }
        return false;
    }
    
    public boolean addPrograma(Programa programa) {
        if (!this.programas.contains(programa)) {
            this.programas.add(programa);
            return true;
        }
        return false;
    }

    public Programa getProgramaConMasCancionesDeArtista(Artista artista) {
        ArrayList<Integer> frecuencias = new ArrayList<>();
        for (Programa programa : this.programas) {
            frecuencias.add(programa.getFrecuenciaCanciones(artista));
        }
        int index = frecuencias.indexOf(Collections.max(frecuencias));
        return this.programas.get(index);
    }
    
}
