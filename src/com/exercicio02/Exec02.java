package com.exercicio02;
import java.util.Scanner;

/*
        Escreva uma classe Agenda, que contém varios contatos do tipo Contato.
        Cada contato possui nome, telefone e email. A Agenda também possui um
        nome. Crie um programa teste que pega para o usuério entrar com o
        nome da Agenda e em seguida 3 contatos. Crie métodos que retornem
        uma String com a informacão de cada contato e também de todos os
        contatos da agenda.

        Por Loiane Groner
 */



public class Exec02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da agenda:");
        String nomeAgenda = scan.nextLine();

        Agenda a = new Agenda();

        a.setNome(nomeAgenda);

        Contatos[] contatos = new Contatos[3];

        System.out.println("Agora, digite as informações dos contatos: \n");

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Nome do contato " + (i+1) + ": ");
            String nome = scan.nextLine();
            System.out.println("Telefone do contato " + (i+1) + ": ");
            String telefone = scan.nextLine();
            System.out.println("Email do contato " + (i+1) + ": ");
            String email = scan.nextLine();

            Contatos c = new Contatos();
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setEmail(email);
            contatos[i] = c;
        }
        a.setContato(contatos);



        System.out.println(a.listarContatos(contatos));




    }
}
