package maven_surefire_compile_plugins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUser {

	@Test
	public void enterUserDetails() {
		System.out.println("Enter User Details");
		Assert.fail("Failed purposely using Assert Fail");
	}
	
	@Test
	public void submitUserDetails() {
		System.out.println("Submit User Details");
	}
	
}
