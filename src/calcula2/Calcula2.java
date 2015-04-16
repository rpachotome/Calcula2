/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author rpachotome
 */
public class Calcula2 {
    
    public int realizaOperacion(int num1, int num2, int resultado){
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona operación",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Suma", "Resta","Division", "Multiplicacion", "Salir"},
                "Sair do programa");
        switch(opcion){
            
        case 0: resultado=num1+num2;
     
        
        case 1: resultado=num1-num2;
    
            
        case 2: if (num2==0)
            JOptionPane.showMessageDialog(null, "No se puede dividir un numero entre 0");
        else resultado=num1/num2;
       
            
        case 3: resultado=num1*num2;
            
        case 4: System.exit(0);
}
        return resultado;
    }
    public static void main(String[] args) {
        
        
    }
    
}
