package org.junittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class SampleProgram extends Base {
	@Test
	public void tc2() {
		System.out.println("Test CAse 2");
		launchUrl("https://en-gb.facebook.com/");
		String title = pageTitle();
		String url = pageUrl();
		sam a = new sam();
		passText("dharsini", a.getEmail());
		//Assert.assertTrue("Check your Page Title",title.contains("Facebook"));
		Assert.assertEquals("Check your url", url, url.contains("Facebook"));
		passText("Inmakes", a.getPassword());
		
		
	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		launchUrl("https://www.flipkart.com/");
		

	}
	@Before
	public void startDate() {
		launchBrowser();
		windowMaximize();
	}
	@After
	public void endDate() {
		//closeEntireBrowser();
		
	}
	@BeforeClass
	public static void launchtheBrowser() {
        launchBrowser();
		windowMaximize();
	}
	@AfterClass
	public static void closeentireBrowser() {
		//closeEntireBrowser();
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://www.meesho.com/");

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
