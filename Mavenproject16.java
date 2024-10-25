/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject16;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject16 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       
       int i = 1;
       System.out.println("Digite um número");
       int numero = leia.nextInt();
       while(i <=10)
       {System.out.println(numero+"x"+i+"="+numero * i);
        i++;}
        leia.close();    
    }
    
}
