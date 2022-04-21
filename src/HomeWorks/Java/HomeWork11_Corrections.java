package HomeWorks.Java;

import java.util.HashMap;
import java.util.Set;

public class HomeWork11_Corrections {

    public static void main(String[] args) {


        String[] colorNames = {"green", "yellow", "red", "white", "grey", "green"};


        colorCount(colorNames);


    }






    public static void colorCount(String[] input) {

        HashMap<String, Integer> colors = new HashMap<>();

        for (String val : input) {

            if (colors.containsKey(val)) {

                Integer count = colors.get(val);

                count = count + 1;

                colors.replace(val, count);

            } else {

                colors.put(val, 1);
            }
        }

        Integer maxCount = 0;

        Set<String> keys = colors.keySet();

        for (String color : keys) {

            Integer count = colors.get(color);

            if (count > maxCount) {

                maxCount = count;
            }
        }

        for (String color : keys) {

            Integer count = colors.get(color);

            if (count == maxCount) {

                System.out.println("\nColor appearing max number of times in the array-->" + color + "-" + count);
            }
        }

    }
}