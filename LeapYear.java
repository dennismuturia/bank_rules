import java.io.Console;

public class LeapYear {

    public static void main(String[] args) {
	// This is a code for leap year
        System.out.println("Hello am a leap year calculator. Lets start");

       Console myConsole = System.console();
       System.out.println("Enter the year to see if its a leap year");
       //Let user to enter the year
       String year = myConsole.readLine();
       int myYear = Integer.parseInt(year);

       if(myYear%4==0 && myYear%400==0 || myYear%100==0){
           System.out.println("THe year "+ myYear+" "+"Is a leap Year");
       }else {
           System.out.println("THe year "+ myYear+" "+"Is not a leap Year");
       }
    }
}