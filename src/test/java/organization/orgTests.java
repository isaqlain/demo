package organization;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class orgTests {
	
	@Test
	public void test1() {
		System.out.println("Test 1 running");
		Reporter.log("Reporter running",true);
	}

}
