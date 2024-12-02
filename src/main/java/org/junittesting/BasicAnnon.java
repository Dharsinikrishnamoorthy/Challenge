package org.junittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BasicAnnon {
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		

	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		
	}
	@Before
	public void startDate() {
		System.out.println("Start Date and Time");
	}
	@After
	public void endDate() {
		System.out.println("End Date and Time");
	}
	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Launch Browser....");
	}
	@AfterClass
	public static void closeBrowser() {
		System.out.println("Close Browser...");
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		
	}
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
		
	}
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
		
	}

}
