package com.exercicio01;

/*
        Write a function to convert a name into initials.
        This kata strictly takes two words with one space in between them.
        The output should be two capital letters with a dot separating them.
        It should look like this:
        Sam Harris => S.H
        patrick feeney => P.F

        By - Code Wars
 */


public class Exec01 {

    public static String abbrevName(String name) {

        String separateName[] = name.split(" ");
        name = separateName[0].toUpperCase().charAt(0) + "." + separateName[1].toUpperCase().charAt(0);

        return name;
    }

    public static void main(String[] args) {

            String name = "Sam Harris";

        System.out.println(abbrevName(name));
        }


    }

