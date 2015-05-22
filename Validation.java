/*****************************************************
 * Kelly Schiller                                    *
 * COSC 2050.01 Java Programming I                   *
 * Program File: Validation.java                     * 
 * Program: Reservation Calculator                   *
 *                                                   *
 ****************************************************/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Validation
{

    public static int getInt(Scanner sc, String user)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(user);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Wrong type of integer value.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
    
     public static double getDouble(Scanner sc, String user)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(user);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Invalid decimal value. Please try again.");
            }
            sc.nextLine();
        }
        return d;
    }

    public static int getIntWithinRange(Scanner sc, String user,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, user);
            if (i <= min)
                System.out.println(
                    "Number must be greater than " + min + ". Please try again!");
            else if (i >= max)
                System.out.println(
                    "Number must be less than " + max + ". Please try again!");
            else
                isValid = true;
        }
        return i;
    }

   public static String getRequiredString(Scanner sc, String user)
    {
        String s = "";
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(user);
            s = sc.nextLine();
            if (s == null || s.equals(""))
            {
                System.out.println("This entry is required. Try again.");
            }
            else
            {
                isValid = true;
            }
        }
        return s;
    }

    public static GregorianCalendar getMonthDayYearWithInRangeFromDateString(Scanner sc, String theDate){
      String[] mDY = theDate.split("/");
      
      int monthIn = Integer.parseInt(mDY[0]);   
      int dayIn = Integer.parseInt(mDY[1]);
      int yearIn = Integer.parseInt(mDY[2]);
      
      GregorianCalendar now = new GregorianCalendar();  
      int thisYear = now.get(Calendar.YEAR);
      if(yearIn < thisYear) {
          yearIn = Validation.getIntWithinRange(sc, 
                  String.format("The year should not be less than %d. Re-enter year: ", thisYear)                 
                  ,thisYear-1, 2801);
      }
      
      if(monthIn < 1 || monthIn > 12) {
          monthIn = Validation.getIntWithinRange(sc, 
                  "Invalid. Please re-enter the month: "
                  ,0, 13);
      }
      
      int totalDays = countDays(monthIn, yearIn);
      if(dayIn > totalDays) {
          dayIn = Validation.getIntWithinRange(sc, 
                  String.format("The number of days should be between 1 and %d. Re-enter day: ", totalDays)                 
                  ,0,totalDays+1);
      }
      
      return new GregorianCalendar(yearIn, monthIn - 1, dayIn);
   }

    public static double getDoubleWithinRange(Scanner sc, String user,
    double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, user);
            if (d <= min)
                System.out.println(
                    "Number must be greater than " + min + "Try Again.");
            else if (d >= max)
                System.out.println(
                    "Number must be less than " + max + "Try Again.");
            else
                isValid = true;
        }
        return d;
    }

    
    
    public static boolean getAnotherReservation(Scanner sc)
    {
        boolean isValid = false;
        System.out.print("Do you want to make another reservation? (y/n): " );
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            isValid = true;
        }
        return isValid;
    }
    
    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                }
                else {
                    count = 28;
                }
                if ((year % 100 == 0) & (year % 400 != 0)) {
                    count = 28;
                }
        }
        return count;
    }
}
