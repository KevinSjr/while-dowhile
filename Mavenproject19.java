/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject19;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject19 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
        int contador =1;
       System.out.println("Digite um número");
       int numero = leia.nextInt();
       while(contador <= numero)
       {if (contador  % 2 == 0)
       {System.out.println(contador);}
       
       contador++;
           }
    }
}
