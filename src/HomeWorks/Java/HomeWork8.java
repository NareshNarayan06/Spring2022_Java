package HomeWorks.Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class HomeWork8 {
    public static void main(String[] args) {

        PrintTimeLine(5);
    }





    public static void PrintTimeLine(int input){

        Calendar myCal = Calendar.getInstance();
        Date myDate = myCal.getTime();
        SimpleDateFormat sF= new SimpleDateFormat("ha");
        String myTime = sF.format(myDate);
        System.out.print("Now");

        for(int i = 0 ; i <= input ; i++){

            myCal.add(Calendar.HOUR,2);
            Date date = myCal.getTime();
            System.out.print(" "+ sF.format(date).toLowerCase());

        }



    }





}
