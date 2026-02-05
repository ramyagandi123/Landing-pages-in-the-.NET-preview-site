package justTest;

import org.testng.annotations.Test;

public class invocationCount {
@Test(invocationCount =2)
public void demo1() {
	System.out.println("demo1");
}
@Test
public void demo2() {
	System.out.println("demo2");
}
@Test
public void demo3() {
	System.out.println("demo3");
}
@Test(invocationCount =-3)
public void demo4() {
	System.out.println("demo4");
}
@Test(invocationCount =2)
public void demo5() {
	System.out.println("demo5");
}
}
