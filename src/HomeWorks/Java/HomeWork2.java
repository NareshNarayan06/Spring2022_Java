package HomeWorks.Java;

public class HomeWork2 {
    public static void main(String[] args) {

        String a= "My full name is"; // using only string data type
        String myNameIs = "Naresh Sasikumar";// // using only string data type


char myFirstNameInitial= 'N'; // using only char data type
char myLastNameInitial= 'S'; //using only char data type


byte numOfHoursInADay= 24;

short maxNumOfDaysInAYear= 365;

int numOfEmployeesInTesla= 70757;

long totalPopulationInUkraine= 44130000;

float mortgageRateOfChase=2.39f;

double balanceOfMyBankAccount= 1500.59;

char usd='$';

boolean DoesTheSunRisesInWest=false;

        String space=" ";
        String fullStop= ".";
        String and= "&";

        System.out.println(a + space + myNameIs+fullStop +"The Initials of my name is " + myFirstNameInitial+myLastNameInitial+fullStop
        + "\nThe number of hours in a day is " + numOfHoursInADay+ " hr " + and +space+"The maximum number of days in a year is "+
                maxNumOfDaysInAYear +space+"days"+fullStop+ "\nTotal number of employees in Tesla Organisation is "+ numOfEmployeesInTesla
        +fullStop +"\nThe total population of Ukraine is " + totalPopulationInUkraine+fullStop+"\nThe mortgage rate of chase bank is "+mortgageRateOfChase
        +"% APR"+space +and+" The balance on my bank account is " +usd+balanceOfMyBankAccount+space+fullStop+ "\nDoes the sun rises in the west ? "
        +DoesTheSunRisesInWest);

    }
}
