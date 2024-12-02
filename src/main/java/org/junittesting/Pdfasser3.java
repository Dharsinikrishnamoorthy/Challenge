package org.junittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pdfasser3 extends Base {
	@Test
	public void tc2() {
		System.out.println("Test CAse 2");
		launchUrl(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fsignin%2F&emr=1&ifkv=AcMMx-fh9at4hAgtRtQTKjWolgwU7Qy4xuUDgpxp8uIonmvfBna3wYJy_6wJA4BPBOJs6_Qo38oi&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1075732823%3A1731516699187749&ddm=1");

		String title = pageTitle();
		String url = pageUrl();
		Pdfassert p = new Pdfassert();
		passText("dharsini", p.getEmail());
		 Assert.assertTrue("Check your Page Title",title.contains("Gmail"));
		//Assert.assertEquals("Check your url", url, url.contains("gmail"));
		clickBtn(p.getNext());

	}

	@Before
	public void startDate() {
		launchBrowser();
		windowMaximize();
	}

	@After
	public void endDate() {
		// closeEntireBrowser();

	}

	@BeforeClass
	public static void launchtheBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	public static void closeentireBrowser() {
		// closeEntireBrowser();
	}

	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://www.meesho.com/");

	}
}