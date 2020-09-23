/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author jadg13
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tipo de dato primitivo: int para entero, double para numeros, char una letra, boolean para valores logico
        int num1;
        int num2;
        int suma;
        
        //Tipo de dato por referencia
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el primer valor entero");
        num1 = sc.nextInt();
        
        System.out.println("Ingresa el segundo valor entero");
        num2 = sc.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma de los enteros " + num1 + " + "+ num2 + " = " + suma);
    }
    
}
