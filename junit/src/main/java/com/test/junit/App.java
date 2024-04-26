package com.test.junit;

import com.test.junit.model.PromoCodes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Junit5!" );
        
        PromoCodes promoCodes = new PromoCodes();
        System.out.println(promoCodes.getDiscount("JUMBO"));
        System.out.println(promoCodes.getAmountAfterDiscount("TRYNEW90", 1000));
        System.out.println(promoCodes.getDiscountAmountWithTaxes("SUNDAY", 1000));
    }
}
