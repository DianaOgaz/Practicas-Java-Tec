
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] iArreglo = new String [15];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce valores");
        for (int i = 0; i < iArreglo.length; i++) {
         iArreglo[i] = entrada.nextLine();
         
    }
        impArreglo(iArreglo);
    }
    public static void impArreglo(String[] args){ 
    System.out.println("");    
        for (int i = 0; i < args.length; i++) {
            System.out.print("[" + args[i] + "]");
        
}
}}

