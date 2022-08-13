package com.exercicio03;

/*
        Write a function that accepts an array of 10 integers (between 0 and 9),
        that returns a string of those numbers in the form of a phone number.

        By Code Wars
 */


public class exec03 {

    public static String createPhoneNumber(int[] numbers) {

        String newNumbers[] = new String[numbers.length];

        String phoneNumbers = "";

        for (int i = 0; i < numbers.length; i++)
        {
            newNumbers[i] = Integer.toString(numbers[i]);
            phoneNumbers += numbers[i];
        }

        String phoneNumber = "(" + phoneNumbers.substring(0,3)+ ") " + phoneNumbers.substring(3,6) + "-" + phoneNumbers.substring(6,10);

        return phoneNumber;
    }

    public static void main(String[] args) {

        int vetNumbers[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(vetNumbers));

    }
}
