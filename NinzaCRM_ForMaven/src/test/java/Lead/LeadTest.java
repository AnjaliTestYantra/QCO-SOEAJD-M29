package Lead;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LeadTest {
	@Test
	public void addleadTest() {
		Reporter.log("Clicked add button",true);
		Reporter.log("updated required details",true);
		Reporter.log("LEAD added successfully",true);
		Reporter.log("LEAD3 added successfully",true);
	}
	
}
