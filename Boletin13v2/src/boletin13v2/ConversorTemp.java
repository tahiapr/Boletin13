/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13v2;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class ConversorTemp {
    final float CENTIGRADOS = 80;
    float centi, reamur;   

    public ConversorTemp() {
    }
    
    
    public void centigradosAReamur (){

    
    do { 
    centi = Integer.parseInt(JOptionPane.showInputDialog("Teclee grados centígrados"));
    if(centi<80)
        JOptionPane.showMessageDialog(null, "La temperatura debe ser superior a 80º");      
    } while (centi < CENTIGRADOS);
    
    reamur = (float) 4/5 * centi;
    System.out.println("La temp en Reamur es "+reamur);
    }
}
