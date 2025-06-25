package sales;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateSalesTest {
	
	
	@Test(groups = "SmokeTest")
	public void createSaleTest() {
		Reporter.log("Created sales ",true);
	}
	
	@Test
	public void productInfo() {
		Reporter.log("Product info ",true);
		Reporter.log("New change");

	}

}
