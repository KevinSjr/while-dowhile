/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject23;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject23 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       
       
      int i=0;
      int numero;
      
      do{System.out.println("Digite um inteiro");
         numero = leia.nextInt();
         if(numero % 2 !=0)
         {i++;}
             }
      while(numero != 0);
      System.out.println("foram inseridos "+i+" numeros impares");
      leia.close();
    }
}
