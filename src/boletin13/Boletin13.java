/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author tperezrodriguez
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas temp1 = new ConversorTemperaturas();
        
        try {
         temp1.centigradosAFharenheit();
        } catch (TemperaturaErradaExcepcion ex){
            System.out.println(ex.getMessage());
        }
        
        try {
         temp1.centigradosAReamur();
        } catch (TemperaturaErradaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
