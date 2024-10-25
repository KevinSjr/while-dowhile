/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject15;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject15 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0;
        int i = 0;
        while (i >=0)
        {System.out.println("Digite um numero inteiro");
          i = leia.nextInt();
          if (i >=0)
          soma += i;
          
        }
        System.out.println("o resultado da soma é "+soma);
        leia.close();
    }
   
}
