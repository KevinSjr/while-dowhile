/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject21;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject21 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        double temp;
        do{System.out.println("Digite uma temperatura");
           temp = leia.nextDouble();
           double conversao = (temp * 9/5) +32;
           System.out.println("a temperatura em fahrenheit é"+conversao);}
           while (temp != 0);
        leia.close();
    }
}
