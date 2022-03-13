package HomeWorks.Java;

import java.util.Locale;

public class HomeWork4 {

    public static void main(String[] args) {

        //Task-1

        String fullStop =".";
        String sentence1 = "She walks in beauty";
        int lengthOfSentence1 = sentence1.length();
        int result1 = lengthOfSentence1 >=5 ? 10 : 15;
        System.out.println("\nTASK-1"+"\nsentence1-> "+sentence1 + "\nThe length of the sentence1 is "+lengthOfSentence1 +fullStop+ "\nThe value of result1 is " +result1+fullStop
        );
        System.out.println();

        //Task-2

        String myFullName = "Naresh Narayan Sasikumar";
        String alphabetToCheck = "a";

        System.out.println("\nTASK-2"+"\nMy full name is "+myFullName+fullStop+"\nIs my full name contains 'a' ? "+myFullName.toLowerCase().contains(alphabetToCheck.toLowerCase())+
                "\nIs my full name ends with 'a' ? "+myFullName.toLowerCase().endsWith(alphabetToCheck.toLowerCase()))
        ;

        //Task-3

        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String wordToCheck = "King";
        String index ="EW";

        System.out.println("\nTask-3"+"\nIs the task3 contains the word 'King'? "+task3.toLowerCase().contains(wordToCheck.toLowerCase())
        +"\nThe index of first occurrence of 'EW' is "+ task3.toLowerCase().indexOf(index.toLowerCase())+fullStop);

        //Task-4

        String task4="kINg";
        System.out.println("\nTask-4"+"\nThe value of task4 in title case is "+task4.toUpperCase().substring(0,1)+task4.toLowerCase().substring(1)+fullStop);



    }
}
