package com.test.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.test.junit.model.PromoCodes;

/**
 * Unit test for simple App.
 */
//public class AppTest 
//    extends TestCase
//{
//	
//	PromoCodes promoCodes;
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//        promoCodes = new PromoCodes();
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//    
//    public void testAppAgain() {
//    	int expectedCabFare = 500;
//    	int actualCabFare = 500;
//    	assertEquals(expectedCabFare, actualCabFare);
//    }
//    
//    public void testPromoCode() {
//    	assertEquals(true, promoCodes.checkPromoCodes("Bingo"));
//    }
//}

public class AppTest{
	
	PromoCodes promoCodes =  new PromoCodes();
	
//	@Test
//	public void testPromoCode() {
//    	assertEquals(true, promoCodes.checkPromoCodes("Bingo"));
//    }
//	
//	@Test
//	public void testDiscount() {
//		String pCode = "Jumbo";
//		double expectedDiscount = 0.4;
//		double actualDiscount = promoCodes.getDiscount(pCode);
//		assertEquals(expectedDiscount, actualDiscount);
//	}
//	
//	
//	@Test
//	public void testAmountAfterDiscount() {
//		String pCode = "TRYNEW90";
//		double amount = 1000.0;
//		double expectedAmountAfterDiscount = 100.0;
//		double actualAmountAfterDiscount = promoCodes.getAmountAfterDiscount(pCode, amount);
//		assertEquals(expectedAmountAfterDiscount, actualAmountAfterDiscount);
//	}
//	
//	@Test
//	public void testDiscountAmountWithTaxes() {
//		String pCode = "SUNDAY";
//		double amount = 1000.0;
//		double expectedDiscountAmountWithTaxes = 885.0;
//		double actualDiscountAmountWithTaxes = promoCodes.getDiscountAmountWithTaxes(pCode, amount);	
//		assertEquals(expectedDiscountAmountWithTaxes, actualDiscountAmountWithTaxes);
//	}
	
	@Test
	public void testBasicFlow() {
		assertEquals(0.4, promoCodes.getDiscount("JUMBO"));
		assertEquals(0.2, promoCodes.getDiscount("BINGO"), "Sorry! This promo code is not available!");
	}
	
	@Test
	public void testGroup() {
		assertAll("Promo Code Discounts", 
				 () -> assertEquals(0.4, promoCodes.getDiscount("JUMBO")),
				 () -> assertEquals(0.2, promoCodes.getDiscount("BINGO")),
				 () -> assertEquals(0.9, promoCodes.getDiscount("TRYNEW90"))
				);
	}
	
	@Test
	public void testLuckyPromoCode() {
		
		Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, 
										() -> promoCodes.luckyPromoCode(7));
		System.out.println("Message: " + exception.getMessage());
	}
}


