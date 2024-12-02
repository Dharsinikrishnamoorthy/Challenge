package org.junittesting;

public class Sample extends Base {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		windowMaximize();
		
		sam a = new sam();
		passText("dharsini", a.getEmail());
		passText("Inmakes", a.getPassword());
		
		driver.navigate().refresh();
		passText("Inmakes", a.getEmail());
		passText("Infotech", a.getPassword());
	}
	

}
