package HomeWorks.Java;

public class HomeWork7 {


    public static String makeAbbreviation(String sentenceToAbbreviate) { // To Make Abbreviation

        String[] sentenceToAbbreviateToArray = sentenceToAbbreviate.split(" ");

        String result = "";

        for (int i = 0; i < sentenceToAbbreviateToArray.length; i++) {

            result += sentenceToAbbreviateToArray[i].substring(0, 1).toUpperCase();

        }

        return result;
    }


    public static boolean checkPalindrome(String givenWord) {

        String reverse = "";

        for (int i = givenWord.length() - 1; i >= 0; i--) {

            reverse += givenWord.charAt(i);
        }

        return givenWord.equals(reverse);
    }


    public static void main(String[] args) {

        // Q1

        String givenSentence = "Make america great again";

        String afterAbbreviation = makeAbbreviation(givenSentence);

        System.out.println("After Abbreviating " + givenSentence + " --> " + afterAbbreviation);

        // Q2

        String givenSentence1 = "iRoN mAn WiLL bE baCK sOOn";

        HomeWork7 hW7obj = new HomeWork7();

        String afterTitleCase = hW7obj.makeTitleCase(givenSentence1);

        System.out.println("\nAfter Title Casing " + givenSentence1 + "--> " + afterTitleCase);


        //Q3

        int[] givenArray = {-5, -6, 0, -4, -10};

        int maxValueInGivenArray = hW7obj.maxValueInArray(givenArray);

        System.out.println("\nThe maximum value from the given int-array --> " + maxValueInGivenArray);


        //Q4

        String givenWord = "EyE";

        boolean isItPalindrome = checkPalindrome(givenWord);

        System.out.println("\nIs the given word palindrome ? --> " + isItPalindrome);


        //Q5

        String []giveWordArray = {"happy", "Happy new year", "peaceful" , "king kong"};

        String maxValue= hW7obj.findMaxValue(giveWordArray);

        System.out.println("\nThe maximum value of the String[] --> "+maxValue);


    }


    public String makeTitleCase(String sentenceToTitleCase) {

        String[] sentenceToTitleCaseArray = sentenceToTitleCase.split(" "); // To Make TitleCase

        String result = "";

        for (int i = 0; i < sentenceToTitleCaseArray.length; i++) {

            result += sentenceToTitleCaseArray[i].substring(0, 1).toUpperCase() +
                    sentenceToTitleCaseArray[i].substring(1).toLowerCase() + " ";
        }

        return result.trim();

    }

    public int maxValueInArray(int[] givenArray) {

        int maximum = givenArray[0];

        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] > maximum)
                maximum = givenArray[i];
        }
        return maximum;
    }

    public String findMaxValue(String[] givenStringArray) {

        String maximum = givenStringArray[0];

      for (int i = 1; i < givenStringArray.length; i++) {

          if (givenStringArray[i].length() > maximum.length()) {

              maximum=givenStringArray[i];


          }
      }

      return maximum;

    }


}
