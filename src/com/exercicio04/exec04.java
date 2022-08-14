package com.exercicio04;

/*

        Given a list of integers, determine whether the sum of its elements is odd or even.
        Give your answer as a string matching "odd" or "even".
        If the input array is empty consider it as: [0] (array with a zero).

        Examples:
        Input: [0]
        Output: "even"

        Input: [0, 1, 4]
        Output: "odd"

        Input: [0, -1, -5]
        Output: "even"
        Have fun!

        by Code Wars
 */

public class exec04 {

    public static String oddOrEven(int[] array) {

        Integer sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        if(sum == 0) {
            return "odd";
        }

        else if(sum % 2 == 0){
            return "even";
        }

        else {
            return "odd";
        }
    }
    public static void main(String args[]) {

        int vet[] = {2, 5, 34, 6};

        System.out.println(oddOrEven(vet));
    }
}
