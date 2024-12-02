package org.junittesting;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({PdfSuite1.class,PdfSuite2.class})*/
public class PdfSuiteFinal {
	@Test
	public void tc33() {
		
		Result rc = JUnitCore.runClasses(PdfSuite1.class,PdfSuite2.class,Pdfassert.class);
		
		System.out.println("Total Test case Run Count : "+rc.getRunCount());
		System.out.println("Total Test case Run Time : "+rc.getRunTime());
		System.out.println("Total Test case Failed Count : "+rc.getFailureCount());
		System.out.println("Total Test case Ignored Count : "+rc.getIgnoreCount());
		
		List<Failure> f = rc.getFailures();
		for (Failure fail : f) {
			System.out.println(fail);
			
		}
	}

}
