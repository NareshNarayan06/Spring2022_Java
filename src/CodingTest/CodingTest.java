package CodingTest;

import java.util.Arrays;
import java.util.Locale;

public class CodingTest {


    public static void main(String[] args) {

        //Q1

        int []inputArray ={10,9,8,7,6,5,4,3,2,1};

        int[] result=sortArray(inputArray);

        System.out.println("Sorted Array: "+Arrays.toString(result));


        //Q2
        int result1 = sumOfDigits(123);

        System.out.println("\nSum of Digits: " + result1);

        //Q3
        int[] input = {34,67,98,67,43};

        int[] res = removeInt(input,98);

        System.out.println("\nArray after removing: "+Arrays.toString(res));

        //Q4
        String [] input1 = {"happY", "king", "peace", "living standard"};

        String[] input2 ={"king kong", "Happy", "PEACE"};

        System.out.println("\nThe common strings are ");

        commonStrings(input1,input2);

    }


    public static int[] sortArray (int [] inputArray){


        for(int i = 0 ;i < inputArray.length ; i++) {
            int minimum = inputArray[i];
            int minIndex = i;

            for (int k = i + 1 ;k<inputArray.length ; k++){
                if (minimum >inputArray[k]){
                    minimum=inputArray[k];
                    minIndex = k;
                }
            }
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = minimum;
        }
        return inputArray;
    }

    public static int sumOfDigits(int number){
        int num, sum = 0;
        while(number>0){
            num = number%10;
            sum += num;
            number = number/10;
        }
        return sum;
    }

    public static int[] removeInt(int[] numbers, int num) {
        int[] newNumber = new int[numbers.length];
        int numberRemoved = 0;
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != num) {
                newNumber[j++] = numbers[i];
            } else
                numberRemoved++;
        }
        int[] numArray = new int[numbers.length - numberRemoved];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = newNumber[i];
        }
        return numArray;
    }

    public static void commonStrings (String[] strings1, String[] strings2){

        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings2.length; j++) {
                if (strings1[i].equalsIgnoreCase(strings2[j])) {
                    System.out.println(strings1[i].toLowerCase());
                }
            }
        }

    }
}

