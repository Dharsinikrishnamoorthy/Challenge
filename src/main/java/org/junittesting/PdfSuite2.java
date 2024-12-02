package org.junittesting;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PdfSuite2 extends Base {
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://www.meesho.com/");

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
	public void tc5() {
		System.out.println("Test Case 5");
		launchUrl("https://www.snapdeal.com/");

	}

	@Test
	public void tc4() {
		System.out.println("Test Case 4");
		launchUrl("https://www.myntra.com/");

}
}