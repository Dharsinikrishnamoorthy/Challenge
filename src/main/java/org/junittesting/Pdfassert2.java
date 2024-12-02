package org.junittesting;

public class Pdfassert2 extends Base{
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fsignin%2F&emr=1&ifkv=AcMMx-fh9at4hAgtRtQTKjWolgwU7Qy4xuUDgpxp8uIonmvfBna3wYJy_6wJA4BPBOJs6_Qo38oi&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1075732823%3A1731516699187749&ddm=1");
		
		windowMaximize();
		Pdfassert p = new Pdfassert();
		passText("dharsini", p.getEmail());
		clickBtn(p.getNext());
		
		

}
}