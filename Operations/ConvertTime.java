package Operations;

import java.util.Scanner;

public class ConvertTime{
  
  Scanner scanInp = new Scanner(System.in);

  public void convOperations(){

    System.out.println("Welcome to Time Converter!\n");

    System.out.print("Enter operation (S,M) or press \"C\" to cancel:");
    String userInput = scanInp.nextLine();

    //Making a loop so until the user presses C the loop will run continiously
    while(!userInput.equals("C") || !userInput.equals("c")){

      if(userInput.equals("M")){

        //Ask user which operation they want to happen
        System.out.print("What would you like to convert \"h\" for hour to minute or \"m\" for minute to hour:");
        String userInp2 = scanInp.nextLine();

        if(userInp2.equals("h")){

            System.out.print("Enter the value:");
            int userInp3 = scanInp.nextInt();

            int hourToMins = userInp3 * 60;

            System.out.println("Result of hour to minutes -> " + hourToMins);
            break;
        }else if(userInp2.equals("m")){

            System.out.print("Enter the value:");
            int userInp3 = scanInp.nextInt();

            int minsToHours = userInp3 / 60;

            System.out.println("Result of minutes to hours -> " + minsToHours);
            break;
        }

      }else if(userInput.equals("S")){

        //Ask user which operation they want to happen
        System.out.print("What would you like to convert \"s\" for seconds to minute or \"m\" for minutes to seconds:");
        String userInp2 = scanInp.nextLine();

        if(userInp2.equals("s")){

          System.out.print("Enter the value:");
          int userInp3 = scanInp.nextInt();

          int secToMin = userInp3 / 60;

          System.out.println("Result of seconds to minutes -> " + secToMin);
          break;
        }else if(userInp2.equals("m")){

          System.out.print("Enter the value:");
          int userInp3 = scanInp.nextInt();

          int minToSec = userInp3 * 60;

          System.out.println("Result of minutes to seconds -> " + minToSec);
          break;
        }
      }
    }
  }
}
