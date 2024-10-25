/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject20;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject20 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int escolha;
        do
        {System.out.println("digite 1 para adicionar, 2 para remover e 3 para sair");
         escolha = leia.nextInt();}
        while(escolha != 3);
        leia.close();
    }
        
}
