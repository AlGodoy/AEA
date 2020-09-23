/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.util.Scanner;

/**
 *
 * @author alecg
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int cuadrado;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el numero entero ");
        num = sc.nextInt();
        
        cuadrado = num * num;
        
        System.out.println("El cuadrado del numero entero "+ num +" es "+ cuadrado);
        
        
                
    }
    
}
