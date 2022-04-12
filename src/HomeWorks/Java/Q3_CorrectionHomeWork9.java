package HomeWorks.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3_CorrectionHomeWork9 {

    public static void main(String[] args) {
        //Q3
        int[] inputArray = {1,1,22,66,88};

        System.out.print("\nInt-array after removing input-int-value from an input-int-array--> ");
        removeIntValue(1,inputArray);
    }
    //Q3-Method


    public static int[] removeIntValue ( int valueToRemove , int[] inputArray) {

        List<Integer> inputArrayToArrayList = new ArrayList<>();


        for (int val : inputArray){

            inputArrayToArrayList.add(val);
        }

        for (int i =0 ; i<inputArrayToArrayList.size() ; i++) {

            inputArrayToArrayList.remove(new Integer(valueToRemove));
        }

        int[] returnArray = new int[inputArrayToArrayList.size()];

        for (int i =0 ;i < inputArrayToArrayList.size();i++){

            returnArray[i]=inputArrayToArrayList.get(i);
        }

        System.out.println(Arrays.toString(returnArray));

        return returnArray;
    }
}
