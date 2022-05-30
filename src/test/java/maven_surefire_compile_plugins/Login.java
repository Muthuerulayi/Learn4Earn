package maven_surefire_compile_plugins;

//import org.testng.SkipException;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void enterLoginCredentials() {
		System.out.println("Enter Login Credentials");
	}
	
	@Test
	public void submitLoginCredentials() {
		System.out.println("Submit Login Credentials");
		//throw new SkipException("Skip Exception thrown on purpose");
	}

}
