/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.radio.program;

import core.person.Artista;
import core.person.Invitado;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Emision {
    
    private static int ID = 0;
    
    private int serial;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;

    public Emision(Programa programa) {
        this.serial = Emision.ID;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.programa = programa;
        
        this.programa.addEmision(this);
        
        Emision.ID++;
    }
    
    public boolean addCancion(Cancion cancion) {
        if (!this.canciones.contains(cancion)) {
            this.canciones.add(cancion);
            return true;
        }
        return false;
    }
    
    public boolean addInvitado(Invitado invitado) {
        if (!this.invitados.contains(invitado)) {
            this.invitados.add(invitado);
            return true;
        }
        return false;
    }
    
    public int getCantidadCanciones(Artista artista) {
        int numCanciones = 0;
        for (Cancion cancion : this.canciones) {
            if (cancion.getArtista().equals(artista)) {
                numCanciones++;
            }
        }
        return numCanciones;
    }
    
}
