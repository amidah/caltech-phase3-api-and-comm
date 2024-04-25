package com.test.junit;

import com.test.junit.model.PromoCodes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	PromoCodes promoCodes;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        promoCodes = new PromoCodes();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testAppAgain() {
    	int expectedCabFare = 500;
    	int actualCabFare = 500;
    	assertEquals(expectedCabFare, actualCabFare);
    }
    
    public void testPromoCode() {
    	assertEquals(true, promoCodes.checkPromoCodes("BINGO"));
    }
}
