package com.springaop.demoapp.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

		System.out.println();

		if (method.getName().equals("productPurchase")) {

			System.out.println("[AfterAdvice] after executed " + method.getName());
			
			//3. Notification | Post-Processing
			System.out.println("[AfterAdvice] - Notifying in Action...");
			
			Product product = (Product) target;
			
			System.out.println("[AfterAdvice] - Notifying the user through email " + args[2] + " with invoice of amount " + product.price);
			System.out.println("[AfterAdvice] - " + product.brand + " " + product.name + " will be delivered at " + args[0] + " by " + args[1]);
			System.out.println("[AfterAdvice] - Notify the Shipment and Purchase department for the purchase of " + product.name);

		}
		System.out.println();

	}
}
