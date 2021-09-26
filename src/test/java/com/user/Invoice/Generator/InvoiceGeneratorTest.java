package com.user.Invoice.Generator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare()
    {
        InvoiceGenerator invoiceGenerator =  new InvoiceGenerator();
        double distance = 2.0;
        double time = 5.0;
        double fare = invoiceGenerator.calculateTotalFare(distance, time);
        assertEquals(25.0, fare, 0.0);
    } 
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare()
    {
        InvoiceGenerator invoiceGenerator =  new InvoiceGenerator();
        double distance = 0.1;
        double time = 1.0;
        double fare = invoiceGenerator.calculateTotalFare(distance, time);
        assertEquals(5.0, fare, 0.0);
    }
}
