/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class ConversorTemperaturas {
    final float CENTIGRADOS = 80;
    
    
    public void centigradosAFharenheit ()throws TemperaturaErradaExcepcion {
        float centi = Integer.parseInt(JOptionPane.showInputDialog("Teclea una temperatura en grados centígrados para Farenheir"));
        float fharenheir = (float) (9/5 * centi +  32.4);

        if (centi < CENTIGRADOS) {
            throw new TemperaturaErradaExcepcion ("Recorda que a temperatura non pode ser < 80 ºC");
        }
        
        System.out.println("La temp en Fharenheit es "+fharenheir);
    }
    
    public void centigradosAReamur ()throws TemperaturaErradaExcepcion {
        float centi = Integer.parseInt(JOptionPane.showInputDialog("Teclea una temperatura en grados centígrados para Reamur"));
        float reamur = (float) 4/5 * centi;
        
        if (centi < CENTIGRADOS) {
            throw new TemperaturaErradaExcepcion ("Recorda que a temperatura non pode ser < 80 ºC");
        }
    
        System.out.println("La temp en Reamur es "+reamur);
    }
}