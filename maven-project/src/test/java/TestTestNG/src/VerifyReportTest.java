import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(GenerateReport.class)

public class VerifyReportTest {
	
	String str = "Gooogle";
	@Test
	public void testSimulation0() {
	//Assert.assertTrue(true);
	Assert.assertEquals("Google", str, "Exact match not found hey hey zhatu");
	}
	@Test
	public void testSimulation00() {
	Assert.assertTrue(false);
	}
	
	// Test case <testSimulation000> depends on the intentionally
	// failed test case <testSimulation00>
	@Test(dependsOnMethods = "testSimulation00")
	public void testSimulation000() {
	}
}
