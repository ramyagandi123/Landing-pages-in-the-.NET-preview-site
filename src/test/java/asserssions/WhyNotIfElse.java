package asserssions;

import org.testng.annotations.Test;

public class WhyNotIfElse {

	@Test
	public void demo() {
		String s1="hello";
		String s2="Hello";
		if(s1.equals(s2))
			System.out.println("pass");
		else
		System.out.println("fail");
		
	}
}
