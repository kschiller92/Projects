/*****************************************************
 * Kelly Schiller                                    *
 * COSC 2050.01 Java Programming I                   *
 * Program: Reservation.java                         * 
 *                                                   *
 *                                                   *
 ****************************************************/
import java.math.BigDecimal;
import java.util.Date;
import java.text.*;

public class Reservation {
    
    private Date arrDate;
    private Date departDate;

    public static BigDecimal COST_PER_NIGHT = new BigDecimal("115.00");
    private static int ROUNDING_MODE = BigDecimal.ROUND_HALF_EVEN;
    

    public Reservation(Date arrive, Date depart)
    {
        this.arrDate = arrive;
        this.departDate = depart;
    }

    public BigDecimal getTotalCost()
    {
        int numNights = this.getNumNights();
        BigDecimal nights = new BigDecimal(numNights);
        return COST_PER_NIGHT.multiply(nights);
    }

    public int getNumNights()
    {
        long msArrive = arrDate.getTime();
        long msDepart = departDate.getTime();
        return (int)((msDepart - msArrive) / (24 * 60 * 60 * 1000));
    }
    
    @Override
    public String toString()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        String f = "Arrival Date: " + df.format(arrDate) + "\n"
            + "Departure Date: " + df.format(departDate) + "\n"
            + "Price: " + nf.format(COST_PER_NIGHT) + " per night\n"
            + "Total price: " + nf.format(this.getTotalCost())
            + " for " + this.getNumNights() + " nights";
        return f;
    }
}
    
