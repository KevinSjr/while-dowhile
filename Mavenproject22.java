/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject22;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject22 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       
       System.out.println("Digite um número");
       
       int numero = leia.nextInt();
       
       do{System.out.println(numero);
        numero--;}
       while(numero > 0);
       leia.close();
    }
    
}
