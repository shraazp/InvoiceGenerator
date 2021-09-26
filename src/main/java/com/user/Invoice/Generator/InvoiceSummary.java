package com.user.Invoice.Generator;

/**
 * The class InvoiceSummary is used to generate Invoices
 * @param numberOfRides tells the total rides that have happened so far.
 * @param totalFare gives is total Fare from these rides.
 * @param averageFare i calculated by totalFare/numberOfRides
 * @author Shravya P
 * @since 25-09-2021
 */
public class InvoiceSummary 
{
    public int numberOfRides;
    public double totalFare;
    public double averageFare;

    //Constructor to initialize the variables
    public InvoiceSummary(int numberOfRides, double totalFare) 
    {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numberOfRides;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        InvoiceSummary that = (InvoiceSummary) obj;
        return numberOfRides == that.numberOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }
}