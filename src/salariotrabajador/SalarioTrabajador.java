/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariotrabajador;

import java.util.Scanner;

/**
 *
 * @author alecg
 */
public class SalarioTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int salario; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de las piezas vendidas ");
        num = sc.nextInt();
        
        salario = num * 20;
        
        System.out.println("El salario del trabajador fue de "+ salario +" cordobas");
        
        
    }
    
}
