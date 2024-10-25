/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject17;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject17 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int numero = 13;
        int tentativas =0;
        int palpite = 0;
        while (numero != palpite)
        {System.out.println("tente advinhar o número");
         palpite = leia.nextInt();
         if(palpite <13)
         {System.out.println("Muito baixo!");}
         else if (palpite >13)
         {System.out.println("Muito alto!");}
         tentativas++;
        }
        System.out.println("Você acertou! O número era "+ numero);
        System.out.println("Foram necessarias "+tentativas+" tentativas");
        leia.close();
    }
  
}
