/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
//
/**
 *
 * @author Gebel
 */
public class Mascota extends Thread implements Serializable{
    protected int energia, hambre, sed, felicidad, fuerza, suciedad;
    String nombre;
    
    //instanciaG es para estadistica
    JLabel instanciaG;
    protected boolean mostrar;
    protected boolean corriendo;
    boolean detenerHilo;

    public Mascota(int energia, int hambre, int sed, int felicidad, int fuerza, int suciedad, String nombre, JLabel datos) {
        this.energia = energia;
        this.hambre = hambre;
        this.sed = sed;
        this.felicidad = felicidad;
        this.fuerza = fuerza;
        this.suciedad = suciedad;
        this.nombre = nombre;
        this.instanciaG = datos;
        mostrar = false;
        detenerHilo=true;  
        corriendo=true;
    }
    
   

    
}
