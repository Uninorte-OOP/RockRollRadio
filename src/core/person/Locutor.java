/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.radio.program.Programa;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Locutor extends Persona {
    
    private ArrayList<Programa> programas;
    
    public Locutor(String nombre) {
        super(nombre);
        this.programas = new ArrayList<>();
    }
    
    public boolean addPrograma(Programa programa) {
        if (!this.programas.contains(programa)) {
            this.programas.add(programa);
            return true;
        }
        return false;
    }
    
}
