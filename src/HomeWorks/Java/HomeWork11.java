package HomeWorks.Java;

import java.util.*;

public class HomeWork11 {

    public static void main(String[] args) {

        //Q1

        HashMap<Integer,String> input=new HashMap<>();
        input.put(101,"Sun");
        input.put(102,"earth");
        input.put(103,"moon");

        commonValues(input);

        //Q2

        String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                               "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                               "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                                "green", "green"};


        colorCount(colorNames);




    }


   // Method-Q1

    public static void commonValues(HashMap<Integer,String> input){

        Map<String, ArrayList<Integer>> newHash = new HashMap<>();

       Set<Integer> myKeys=input.keySet();

       for(Integer key: myKeys){

           String value=input.get(key).toLowerCase();

           if (newHash.containsKey(value)) {

               ArrayList<Integer> newVal = newHash.get(value);

               newVal.add(key);

           } else {

               ArrayList<Integer> newVal = new ArrayList<>();

               newVal.add(key);

               newHash.put(value, newVal);
           }
       }

       boolean isItMultivalued = true;

       Set<String> newKeys = newHash.keySet();

       for (String key: newKeys) {

           ArrayList<Integer> val = newHash.get(key);

           if (val.size() > 1) {

               System.out.println(key + " is present with keys = " + val);

               isItMultivalued = false;
           }
       }

       if (isItMultivalued){

           System.out.println("No keys have multivalued");
       }

    }


    //Method-Q2

        public static void colorCount(String[] input){

            HashMap<String, Integer> colors = new HashMap<>();

            for (String color: input) {

                if (colors.containsKey(color)) {

                    Integer count = colors.get(color);

                    count = count + 1;

                    colors.replace(color, count);

                } else {

                    colors.put(color, 1);
                }
            }

            Integer maxCount = 0;

            Set<String> keys = colors.keySet();

            for (String color: keys) {

                Integer count = colors.get(color);

                if (count > maxCount) {

                    maxCount = count;
                  }
            }

            for  (String color: keys) {

                Integer count = colors.get(color);

                if (count == maxCount) {

                    System.out.println("\nColor appearing max number of times in the array-->" + color);
                }
            }

        }

}

