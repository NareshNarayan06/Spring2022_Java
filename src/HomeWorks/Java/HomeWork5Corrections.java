package HomeWorks.Java;

public class HomeWork5Corrections {

    public static void main(String[] args) {

        //Q1

        String myCountry = "United States Of America";
        System.out.println("The name of the country is " + myCountry);
        System.out.println("The length of the country name is "
                + myCountry.toLowerCase().split("").length); //


        //Q4

        int num = 15;
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("\nThe number is divisible by 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println("\nThe number is divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("\nThe number is divisible by 5");
        } else if (num % 5 != 0 && num % 3 != 0) {
            System.out.println("\nThe number is not divisible by 5 and 3");
        }

        //Q6

        String[] words = {"healthy","speak", "learning", "king", "Joy", "smile", "learn", "live", "give", "living standard", "life"};

        String letterToCheck ="l";

        System.out.println("\nThe values which has length greater than 5 and starts with l are ");
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > 5 && words[i].substring(0, 1).toLowerCase().startsWith(letterToCheck.toLowerCase())) {

                System.out.println(words[i]);
            }
        }
    }
}