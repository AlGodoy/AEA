/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadpersona;

import java.util.Scanner;

/**
 *
 * @author alecg
 */
public class EdadPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el año de nacimiento ");
        num = sc.nextInt();
        
        edad = 2020 - num;
        
        System.out.println("La edad de la persona es de "+ edad +" años");
        
        
    }
    
}
