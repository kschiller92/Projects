/*****************************************************
 * Kelly Schiller                                    *
 * COSC 2050.01 Java Programming I                   *
 * Program File: ReservationCalculator.java          * 
 * Program: Reservation Calculator                   *
 *                                                   *
 ****************************************************/
import java.util.*;

public class ReservationCalculator {

        static Scanner sc = new Scanner(System.in);    
   
    public static void main(String[] args) {
       
        System.out.println("Welcome to the Reservation Calculator.");
        do
        {
            
            String startDate = Validation.getRequiredString(sc, "Enter the arrival date (mm/dd/yyyy): ");
            GregorianCalendar arrival = Validation.getMonthDayYearWithInRangeFromDateString(sc, startDate);
            Date arrivalDate = arrival.getTime();
            String departDate = Validation.getRequiredString(sc, "Enter the departure date (mm/dd/yyyy): ");
            GregorianCalendar departure = Validation.getMonthDayYearWithInRangeFromDateString(sc, departDate);
            Date departureDate = departure.getTime();
            Reservation res = new Reservation(arrivalDate, departureDate);
            System.out.println("\n" + res.toString() + "\n");
            System.out.println();
        } while (Validation.getAnotherReservation(sc));   
    }
}
