package HomeWorks.Java;git

public class HomeWork5 {

    public static void main(String[] args) {

        //Q1

        String myCountry = "United States Of America";
        System.out.println("The name of the country is "+myCountry);
        System.out.println("The length of the country name is " +myCountry.toLowerCase().split(" ").length);


        //Q2

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String [] sentence2AfterSplit = sentence2.split(" ");
        System.out.println("\nThe number of words in the sentence2 is "+sentence2AfterSplit.length);



        //Q3

        String sentence3 ="out FIT of Day";
        String[] sentence3AfterSplit = sentence3.toLowerCase().split(" ");

        System.out.println("\n"+sentence3AfterSplit[0].substring(0,1).toUpperCase()+
                          sentence3AfterSplit[1].substring(0,1).toUpperCase()+
                          sentence3AfterSplit[2].substring(0,1).toUpperCase()+
                          sentence3AfterSplit[3].substring(0,1).toUpperCase());



        //Q4

        int num = 10;
        if (num%5==0){
            System.out.println("\nThe number is divisible by 5");
        } if (num%3==0){
            System.out.println("\nThe number is divisible by 3");
        } if (num%5==0 && num%3==0){
            System.out.println("\nThe number is divisible by 5 and 3");
        }if (num%5!=0 && num%3!=0){
            System.out.println("\nThe number is not divisible by 5 and 3");
        }



        //Q5
             double studentScore =25.67;
             int maximumScore = 100;
             double percentage = (studentScore/maximumScore)*100;
             char per ='%';
             char and ='&';
             char space =' ';


        if (studentScore<0 )  {
            System.out.println("\nInvalid student score entered");
            } else if (maximumScore<studentScore || maximumScore<0) {
                System.out.println("\nInvalid maximum score entered");
                  }else if (percentage >=91 && percentage<=100){
                    System.out.println("\nYour Percentage is "+String.format("%.2f",percentage)+
                       per+space+and+space+"Your Grade is A.");
                    }else if (percentage >=81 && percentage<=90.99){
                        System.out.println("\nYour Percentage is "+String.format("%.2f",percentage)+
                        per+space+and+space+"Your Grade is B.");
                        }else if (percentage >=71 && percentage<=80.99){
                            System.out.println("\nYour Percentage is "+String.format("%.2f",percentage)+
                            per+space+and+space+"Your Grade is C.");
                            }else if (percentage >=61 && percentage<=70.99) {
                                System.out.println("\nYour Percentage is " + String.format("%.2f", percentage) +
                                per + space + and + space + "Your Grade is D.");
                                }else{
                                    System.out.println("\nYour Percentage is "+String.format("%.2f",percentage)+
                                    per+space+and+space+"Your Grade is E.");
                                }


        //Q6

        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live", "give", "living standard", "life"};
        System.out.println("\nThe values which has length greater than 5 and starts with l are ");
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > 5 && words[i].substring(0,1).equalsIgnoreCase("l")) {
                System.out.println(words[i]);
            }
        }
    }
}
