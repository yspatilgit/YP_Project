package TestRunnerFramework;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestJunit {

	@Test
	public void testSetup() {
		String str = "I am done with junit setup";
		assertEquals("I am done with junit setup",str);
		
		
	
	
	
		 Result result = JUnitCore.runClasses(TestJunit.class);
		 for(Failure failure : result.getFailures()) {
			 System.out.println(failure.toString());		 
		 }
		 System.out.println("Result ==" + result.wasSuccessful());
	
	}}

