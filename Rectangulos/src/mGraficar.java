
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class mGraficar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame Ventana = new JFrame();
        Lienzo pLienzo = new Lienzo();
        Ventana.setSize(600, 600);
        Ventana.add(pLienzo);
        Ventana.setVisible(true);
       
    }
    
}
