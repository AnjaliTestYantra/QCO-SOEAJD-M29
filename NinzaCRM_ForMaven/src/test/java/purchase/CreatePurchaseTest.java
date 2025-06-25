package purchase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreatePurchaseTest {
	@Test
	public void createPurchaseordertest() {
		Reporter.log("Sales Created", true);
	}
	@Test
	public void createOrdertest() {
		Reporter.log("Order Created ", true);
		Reporter.log(" Purchase Order Created ", true);
	}
}
