/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

import java.util.Scanner;

/**
 *
 * @author ianto
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Prueba 1");
        System.out.println("Prueba 2");
        System.out.println("Prueba 3");
        
        
        System.out.println("HOLAAAAAAA!!!!!! :D");
        
        
        System.out.println("Prueba holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        System.out.println("inserte un numero");

        
        int num = entrada.nextInt() ;
        System.out.println(" otro numero para la suma inserte un numero");


        int num1 = entrada.nextInt();

        
        int suma = num + num1;
        System.err.println("La suma es: " + suma);
    }
}
