package com.exercicio05;

/*

    Encontrar números primos é uma tarefa difícil. Faça um programa que
    gera uma lista dos números primos existentes entre 1 e um número
    inteiro informado pelo usuario.

    por Loiane Groner

 */

import java.util.Scanner;

public class exec05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número:");
        Integer num = scan.nextInt();


        for (int i = 1; i < num ; i++)
        {
            Integer cont = 0;

            for (int j = 1; j < i; j++)
                if (i % j == 0)
                {
                    cont++;
                }
                if (cont < 2)
                {
                    System.out.print("| "+ i + " ");
                }
        }
        System.out.println("|");
    }
}
