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
public class Vista {
    public static void imprimir(Modelo mod){
        JOptionPane.showMessageDialog(null, mod.getNum1()+mod.getOperacion()+mod.getNum2()+"="+mod.getResultado());
    }
}
