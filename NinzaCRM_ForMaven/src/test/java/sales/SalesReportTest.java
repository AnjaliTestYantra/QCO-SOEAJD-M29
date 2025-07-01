package sales;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SalesReportTest {

	@Test
	public void salesRepTest()
	{
		Reporter.log("Sales report success",true);
		Reporter.log("Sales report and product success",true);
	}
}
