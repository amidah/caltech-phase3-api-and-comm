package com.test.junit.model;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCodes {

	List<String> promoCodes;
	TreeMap<String, Double> promoCodesWithDiscounts;

	public PromoCodes() {
		promoCodesWithDiscounts = new TreeMap<String, Double>();
		promoCodes = Arrays.asList("JUMBO", "BINGO", "HAPPY50", "TRYNEW90", "SUNDAY");
		promoCodesWithDiscounts.put(promoCodes.get(0), 0.40);
		promoCodesWithDiscounts.put(promoCodes.get(1), 0.20);
		promoCodesWithDiscounts.put(promoCodes.get(2), 0.50);
		promoCodesWithDiscounts.put(promoCodes.get(3), 0.90);
		promoCodesWithDiscounts.put(promoCodes.get(4), 0.25);
	}

	Double getDiscount(String promoCode) {
		return promoCodesWithDiscounts.containsKey(promoCode) ? promoCodesWithDiscounts.get(promoCode) : 0.05;
	}

	Double getAmountAfterDiscount(String promoCode, double amount) {
		return promoCodesWithDiscounts.containsKey(promoCode)
				? (amount - amount * promoCodesWithDiscounts.get(promoCode))
				: (amount - amount * 0.05);
	}
	
	Double getDiscountAmountWithTaxes(String promoCode, double amount) {
		double amountAfterDiscount = getAmountAfterDiscount(promoCode, amount);
		return (amountAfterDiscount + 0.18 * amountAfterDiscount);
	}
	
	public boolean checkPromoCodes(String promoCode) {
		return promoCodes.contains(promoCode);
	}

}
