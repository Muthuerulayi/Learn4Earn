package maven_surefire_compile_plugins;

import org.testng.annotations.Test;

public class OpenUrl {
	
	@Test
	public void openBrowser() {
		System.out.println("Open Browser");
	}
	
	@Test
	public void enterUrl() {
		System.out.println("Enter URL");
	}

}
