package HomeWorks.Java;

import java.util.*;

public class HomeWork10 {

    public static void main(String[] args) {

    //Q1
        String[] input = {"dog","cat","CAt","lik","monkey","donkey","like"};

        boolean checkDuplicate = checkDuplicateValues(input);

        System.out.println("Does the string array has duplicate value ? --> "+ checkDuplicate);

    //Q2
        String []givenStringArray = {"Red","Reddish","RainBow","license","yellow","RED","like"};

        System.out.print("\nThe Duplicate value----> ");
        printDuplicateValues(givenStringArray);

    }

    //Method-Q1

    public static boolean checkDuplicateValues(String[] givenArray){


        boolean doesItHaveDuplicate=false;

        List<String> myList= Arrays.asList(givenArray);

        int lenOfMyList = myList.size();

        Set<String> mySet= new HashSet<>(myList);

        int lenOfMySet = mySet.size();

        if (lenOfMyList != lenOfMySet){

            doesItHaveDuplicate=true;
        }

        return doesItHaveDuplicate;
    }

    //Q2-Method

    public static void printDuplicateValues (String[] inputArray){


        for (int i = 0 ; i <inputArray.length ; i++){

           for (int j = i+1 ;j < inputArray.length ; j++){

              if (inputArray[i].equalsIgnoreCase(inputArray[j])){

                  System.out.println(inputArray[i]);
              }
           }
        }

    }

}
