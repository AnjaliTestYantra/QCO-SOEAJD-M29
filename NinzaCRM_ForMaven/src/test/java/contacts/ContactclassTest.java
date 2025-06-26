package contacts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ContactclassTest {
	
	@Test
	public void createContact() {
		
		Reporter.log("Contact created", true);
	}
	
	@Test
	public void contactInfo() {
		
		Reporter.log("Contact info", true);
	}
	@Test
	public void contactEmail() {
		
		Reporter.log("email  info", true);
	}
	

	

}
