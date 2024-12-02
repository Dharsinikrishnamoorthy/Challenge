package org.junittesting;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PdfPRgromsannon extends Base{
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		launchUrl("https://en-gb.facebook.com/");

	}
	
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void endDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@BeforeClass
	public static void launchtheBrowser() {
        launchBrowser();
		windowMaximize();
	}
	@AfterClass
	public static void closeentireBrowser() {
		closeEntireBrowser();
	}
	
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		launchUrl("https://www.flipkart.com/");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test Case 3");
		launchUrl("https://inmakeslh.in/");
	}
	
	@Test
	public void tc4() {
		System.out.println("Test Case 3");
		launchUrl("https://www.youtube.com/");
	}

}
