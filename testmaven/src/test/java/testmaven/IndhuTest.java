package testmaven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IndhuTest {
	
	@Test
	public void demoTest() {
		 String name = System.getProperty("browser");
		 System.out.println(name);
		 Reporter.log("indhuis passsed", true);
		
	}
	


}
