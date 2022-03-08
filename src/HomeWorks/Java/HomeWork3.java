package HomeWorks.Java;

public class HomeWork3 {

    public static void main(String[] args) {

        double tempOfMyCityInDegreeCelsius = 20;
        double convertingDegreeCelsiusToFahrenheit =tempOfMyCityInDegreeCelsius * 9/5 + 32; // converting °C to °F
        double convertingDegreeCelsiusToKelvin = tempOfMyCityInDegreeCelsius + 273.15 ; // converting °C to K

        double tempOfMyCityInFahrenheit = 60;
        double convertingFahrenheitToDegreeCelsius = (tempOfMyCityInFahrenheit-32 )* 5/9 ; // converting °F to °C & Limiting decimal points to 2 digits(got it from google)
        double convertingFahrenheitToKelvin = (tempOfMyCityInFahrenheit-32)*5/9+ 273 ; // converting °F to K

        double tempOfMyCityInKelvin = 300;
        double convertingKelvinToDegreeCelsius = tempOfMyCityInKelvin - 273; // converting K to °C
        double convertingKelvinToFahrenheit =(tempOfMyCityInKelvin - 273.15)*9/5 + 32;// converting K to °F & Limiting decimal points to 2 digits


        char degree= '°';
        char kelvin = 'K';
        char fahrenheit = 'F';
        char celsius ='C';

        String and = "&";
        String fullStop = ".";
        String space = " ";


        System.out.println("Converting temperature of my city from Degree Celsius to Fahrenheit is "+ convertingDegreeCelsiusToFahrenheit +degree + "F "+and+space+ "Converting temperature of my city from Degree Celsius to Kelvin is "+convertingDegreeCelsiusToKelvin+kelvin+space+fullStop + "\nConverting temperature of my city from Fahrenheit to Degree Celsius is "
        + String.format( "%.2f" ,convertingFahrenheitToDegreeCelsius) +degree+celsius+space+and +space+ "Converting temperature of my city from Fahrenheit to Kelvin is " + String.format("%.2f",convertingFahrenheitToKelvin)+kelvin+space+fullStop
                +"\nConverting temperature of my city from Kelvin to Degree Celsius is " +convertingKelvinToDegreeCelsius+degree+celsius+space+and+space+
                "Converting temperature of my city from Kelvin to Fahrenheit is " + String.format("%.2f", convertingKelvinToFahrenheit) +degree+fahrenheit+space+fullStop


        );





    }
}
