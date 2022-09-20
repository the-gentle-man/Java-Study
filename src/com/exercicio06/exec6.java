package com.exercicio06;

/*

        I will give you an integer. Give me back a shape that is as long and wide as the integer.
        The integer will be a whole number between 1 and 50.

        Example
        n = 3, so I expect a 3x3 square back just like below as a string:

        +++
        +++
        +++

        by Code Wars
 */

public class exec6 {


    public static final String generateShape(int n) {

        String[] vetN = new String[n];

        String square = "";

        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < n ; j++)
            {
                square = square + "+";
            }
            if (i != n-1 )
            {
                square = square + "\n";
            }
        }

        return square;
    }

    public static void main(String[] args) {


        System.out.println(generateShape(3));
    }
}
