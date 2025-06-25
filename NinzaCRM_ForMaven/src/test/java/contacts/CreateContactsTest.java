package contacts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactsTest {
	@Test
	public void createContactTest() {
		Reporter.log("Contacts Created Successfully", true);
	}
	
	@Test
	public void createContactCampTest() {
		Reporter.log("Contact With Campaign Created Successfully", true);
	}

}
