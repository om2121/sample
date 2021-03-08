package com.phones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Student 1: Snehal Brijeshkumar Patel
 * 
 * Student 2: Aman Jasani
 * 
 * */

class SmartPhoneTest {

	@Test
	void testGetFormattedPrice() {
		SmartPhone smartphone = new SmartPhone();
		smartphone.setPrice(3.0);
		String formatedPrice = smartphone.getFormattedPrice();
		assertTrue(formatedPrice.contains("$"), "Price Formatted");
	}

	//boundary 1
	@Test
	void testGetFormattedPrice2() {
		SmartPhone smartphone = new SmartPhone();
		smartphone.setPrice(-1.0);
		String badPrice = smartphone.getFormattedPrice();
		assertEquals("$-1", badPrice, "Price is Negative");
	}

//format test
	@Test
	void testGetFormattedPrice3() {
		SmartPhone smartphone = new SmartPhone();
		smartphone.setPrice(2.0);
		String badPrice = smartphone.getFormattedPrice();
		assertFalse(badPrice.contentEquals("abcdefghijklmnopkrstuvwxyz"));
	}

	//nullability
	@Test
	void testGetFormattedPrice4() {
		SmartPhone smartphone = new SmartPhone();
		smartphone.setPrice(0.0);
		String price = smartphone.getFormattedPrice();
		assertNotNull(price);
	}
	
	//version test

	@Test
	void testSetVersion() {
		SmartPhone smartphone = new SmartPhone();
		assertThrows(VersionNumberException.class, () -> smartphone.setVersion(6.0),
				"VersionNumberException thrown...!!!");
	}

}
