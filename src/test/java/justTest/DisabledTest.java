package justTest;

import org.testng.annotations.Test;

public class DisabledTest {
@Test(enabled=true)
public void demo1() {
	System.out.println("demo1");
}
@Test(enabled=false)
public void demo2() {
	System.out.println("demo1");
}
@Test(enabled=true)
public void demo3() {
	System.out.println("demo3");
}
}
