/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Image;
import java.io.Serializable;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Gebel
 */
public class Gato extends Mascota implements Serializable {

    int ternura;
    JLabel jLabel7; //muñeco estadistica
    JLabel jLabel6; //muñeco interactivo
    JLabel jLabel8; //nombre muñeco
    JProgressBar uno, dos, tres, cuatro, cinco, seis, siete;
    JButton btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete;
    private boolean vivo;
    private boolean showing;

    public Gato(int energia, int hambre, int sed, int felicidad, int fuerza, int suciedad,
            String nombre, JLabel datos, int ternura, JLabel jLabel7, JLabel jLabel6, JProgressBar uno,
            JProgressBar dos, JProgressBar tres, JProgressBar cuatro, JProgressBar cinco, JProgressBar seis, JProgressBar siete,
            JButton btnUno, JButton btnDos, JButton btnTres, JButton btnCuatro, JButton btnCinco, JButton btnSeis, JButton btnSiete) {
        super(energia, hambre, sed, felicidad, fuerza, suciedad, nombre, datos);
        this.ternura = ternura;
        this.jLabel7 = jLabel7;
        this.jLabel6 = jLabel6;
        this.jLabel8 = jLabel8;
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
        this.cuatro = cuatro;
        this.cinco = cinco;
        this.seis = seis;
        this.siete = siete;
        this.btnUno = btnUno;
        this.btnDos = btnDos;
        this.btnTres = btnTres;
        this.btnCuatro = btnCuatro;
        this.btnCinco = btnCinco;
        this.btnSeis = btnSeis;
        this.btnSiete = btnSiete;
        vivo = true;
        showing = false;
    }

    public void setShowing(boolean showing) {
        this.showing = showing;
    }

    @Override
    public void run() {
        while (corriendo == true) {
            energia -= (int) (Math.random() * 1 + 5);
            hambre -= (int) (Math.random() * 1 + 5);
            sed -= (int) (Math.random() * 2 + 5);
            felicidad -= (int) (Math.random() * 8 + 10);
            fuerza -= (int) (Math.random() * 8 + 10);
            suciedad -= (int) (Math.random() * 5 + 7);
            ternura -= (int) (Math.random() * 2 + 5);
            if (showing == true) {
                uno.setValue(energia);
                dos.setValue(hambre);
                tres.setValue(sed);
                cuatro.setValue(felicidad);
                cinco.setValue(fuerza);
                seis.setValue(suciedad);
                siete.setValue(ternura);
            }
            if (mostrar == true) {
                if (energia <= 0 || hambre <= 0 || sed <= 0 || felicidad <= 0 || fuerza <= 0 || suciedad <= 0 || ternura <= 0) {
                    energia = 0;
                    hambre = 0;
                    sed = 0;
                    felicidad = 0;
                    fuerza = 0;
                    suciedad = 0;
                    ternura = 0;
                    jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/difuntoIcon.png").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/difuntoIcon.png").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
                    btnUno.setEnabled(false);
                    btnDos.setEnabled(false);
                    btnTres.setEnabled(false);
                    btnCuatro.setEnabled(false);
                    btnCinco.setEnabled(false);
                    btnSeis.setEnabled(false);
                    btnSiete.setEnabled(false);
                    instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
                    vivo = false; //bandera pa no mostrar el panel
                    corriendo = false;
                    stop();
                    break;
                } else if (energia < 50 || hambre < 50 || sed < 50 || felicidad < 50 || fuerza < 50 || suciedad < 50 || ternura < 50) {
                    jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(190, 190, Image.SCALE_SMOOTH)));
                } else if (energia > 50 || hambre > 50 || sed > 50 || felicidad > 50 || fuerza > 50 || suciedad > 50 || ternura > 50) {
                    jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(190, 190, Image.SCALE_SMOOTH)));
                }
                instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
            } else {
                if (energia <= 0 || hambre <= 0 || sed <= 0 || felicidad <= 0 || fuerza <= 0 || suciedad <= 0 || ternura <= 0) {
                    energia = 0;
                    hambre = 0;
                    sed = 0;
                    felicidad = 0;
                    fuerza = 0;
                    suciedad = 0;
                    ternura = 0;
                    btnUno.setEnabled(false);
                    btnDos.setEnabled(false);
                    btnTres.setEnabled(false);
                    btnCuatro.setEnabled(false);
                    btnCinco.setEnabled(false);
                    btnSeis.setEnabled(false);
                    btnSiete.setEnabled(false);
                    vivo = false; //bandera pa no mostrar el panel
                    corriendo = false;
                    this.stop();
                    break;
                }
            }
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gallo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //pal label de las estadisticas
    public void setMostrar(boolean mostrar) {
        this.mostrar = mostrar;
    }

    public void setearEnergia() {
        corriendo = false;
        if ((energia += 10) > 90) {
            energia = 100;
        } else {
            if (energia < 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            } else if (energia > 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        uno.setValue(energia);
        //instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
        corriendo = true;
    }

    public void setearHambre() {
        corriendo = false;
        if ((hambre += 10) > 90) {
            hambre = 100;
        } else {
            if (hambre < 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            } else if (hambre > 50) {
               jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        dos.setValue(hambre);
        //instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
        corriendo = true;
    }

    public void setearSed() {
        corriendo = false;
        if ((sed += 10) > 90) {
            sed = 100;
        } else {
            if (sed < 50) {
                 jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            } else if (sed > 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        tres.setValue(sed);
     //   instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
        corriendo = true;
    }

    public void setearFelicidad() {
        corriendo = false;
        if ((felicidad += 10) > 90) {
            felicidad = 100;
        } else {
            if (felicidad < 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            } else if (felicidad > 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        cuatro.setValue(felicidad);
     //   instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
        corriendo = true;
    }

    public void setearFuerza() {
        corriendo = false;
        if ((fuerza += 10) > 90) {
            fuerza = 100;
        } else {
            if (fuerza < 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            } else if (fuerza > 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        cinco.setValue(fuerza);
      //  instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
        corriendo = true;
    }

    public void setearSuciedad() {
        corriendo = false;
        if ((suciedad += 10) > 90) {
            suciedad = 100;
        } else {
            if (suciedad < 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            } else if (suciedad > 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        seis.setValue(suciedad);
       // instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
        corriendo = true;
    }

    public void setearAtributoExt() {
        corriendo = false;
        if ((ternura += 10) > 90) {
            ternura = 100;
        } else {
            if (ternura < 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoTriste.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            } else if (ternura > 50) {
                jLabel7.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
                    jLabel6.setIcon(new ImageIcon(new ImageIcon("src/pqimg/gatoFeliz.jpeg").getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
        siete.setValue(ternura);
      //  instanciaG.setText("<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>");
        corriendo = true;
    }

    public boolean isMostrar() {
        return mostrar;
    }
////////////////////////////////////////////////////////////////////////

    public String ilusionInstantanea() {
        return "<html><p>" + nombre + "</p><p>energia " + energia + "</p><p>hambre " + hambre + "</p><p>sed " + sed + "</p><p>felicidad" + felicidad + "</p><p>fuerza " + fuerza + "</p><p>suciedad " + suciedad + "</p><p>ternura " + ternura + "</html>";
    }

    public int getTernura() {
        return ternura;
    }

    public int getEnergia() {
        return energia;
    }

    public int getHambre() {
        return hambre;
    }

    public int getSed() {
        return sed;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getSuciedad() {
        return suciedad;
    }
////////////////////////////////////////////////////////////////////////////////

    public boolean isVivo() {
        return vivo;
    }

    public void setCorriendo(boolean corriendo) {
        this.corriendo = corriendo;
    }

    public void setearBt() {
        btnUno.setEnabled(true);
        btnDos.setEnabled(true);
        btnTres.setEnabled(true);
        btnCuatro.setEnabled(true);
        btnCinco.setEnabled(true);
        btnSeis.setEnabled(true);
        btnSiete.setEnabled(true);
    }
}
