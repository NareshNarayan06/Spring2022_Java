package HomeWorks.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork9 {

    public static void main(String[] args) {

    HomeWork9 obH9 = new HomeWork9();

    //Q1

    ArrayList<String>givenList = new ArrayList<>();
        givenList.add("apple");
        givenList.add("APPLE");
        givenList.add("appLE");
        givenList.add("Orange");
        givenList.add("StrawBerry");
        givenList.add("Kiwi");

    int getCount=obH9.getCount("Apple",givenList);

    System.out.println("\nThe number of times a given String (ignoring the case) is present in given ArrayList--> "
                       + getCount);


    //Q2

       int getCountContains= obH9.getCountContains("bE",givenList);

        System.out.println("\nThe number of ArrayList-values contains the given String (ignoring the cases)--> "
                           + getCountContains);


    //Q3
        int[] inputArray = {77,99,8,7,6,89,87};

        System.out.print("\nInt-array after removing input-int-value from an input-int-array--> ");
        removeIntValue(89,inputArray);

    }


    //Q1-Method

    public int getCount (String valueToCheck , ArrayList<String> givenArrayList){

        int count = 0 ;

        for( String val : givenArrayList){

            if (valueToCheck.equalsIgnoreCase(val)){
                count++;
            }
        }
        return count;
    }

    //Q2-Method

    public int getCountContains ( String valueToCheck , ArrayList<String> givenArrayList){

        int count= 0 ;

        String valueToCheckInLowerCase = valueToCheck.toLowerCase();

        for ( String value : givenArrayList){

            if (value.toLowerCase().contains(valueToCheckInLowerCase)){

                count++;
            }
        }
        return count;
    }

    //Q3-Method


    public static int[] removeIntValue ( int valueToRemove , int[] inputArray) {

        List<Integer> inputArrayToArrayList = new ArrayList<>();


        for (int val : inputArray){

            inputArrayToArrayList.add(val);
        }

        inputArrayToArrayList.remove(new Integer(valueToRemove));

        int[] returnArray = new int[inputArrayToArrayList.size()];

        for (int i =0 ;i < inputArrayToArrayList.size();i++){

           returnArray[i]=inputArrayToArrayList.get(i);
        }

        System.out.println(Arrays.toString(returnArray));

        return returnArray;

    }

    }














































