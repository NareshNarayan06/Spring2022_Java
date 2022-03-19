package HomeWorks.Java;

import java.util.Arrays;
import java.util.Locale;

public class HomeWork6 {

    public static void main(String[] args) {

        //Q1

        String sentence1 = "you are the hero of thousand wars";
        String[] sentence1AfterSplit = sentence1.toLowerCase().split(" ");
        String singleQuote = "'";
        String result = "";

        for (int i = 0; i < sentence1AfterSplit.length; i++) {
            result += sentence1AfterSplit[i].substring(0, 1).toUpperCase();
        }

        System.out.println("The abbreviation of " + "'" + sentence1
                + "'" + " is " + result + ".");


        //Q2

        String sentence2 = "make amErica great again";
        String[] sentence2Array = sentence2.split(" ");
        String reversed = "";

        int g = sentence2Array.length - 1;
        while (g >= 0) {
            reversed += sentence2Array[g].toLowerCase() + " ";
            g--;
        }

        System.out.println("\nAfter reversing the sentence2 " + "'" +
                sentence2 + "'" + " becomes \n" + reversed.trim() + ".");


        //Q3

        String sentence3 = "happy birthday to you";
        String[] sentence3Array = sentence3.split(" ");
        String titleCase = "";

        int v = 0;
        do {
            titleCase += sentence3Array[v].substring(0, 1).toUpperCase() +
                    sentence3Array[v].substring(1).toLowerCase() + " ";
            v++;
        } while (v < sentence3Array.length);

        System.out.println("\nAfter converting " + "'" + sentence3 + "'"
                + " to title case becomes\n" + titleCase.trim() + ".");


        // Q4

        int[] numbers = {87, 23, 89, 0, 54, 23};
        int minimum =numbers[0];//assuming numbers[0] has the minimum number

        for (int i =0 ; i<numbers.length;i++ ){
            if (numbers[i] < minimum)
                minimum =numbers[i];
        }

        System.out.println("\nThe minimum value ---> "+minimum);
    }
}