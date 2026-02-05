package TestNG;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPackage {
@Test(dataProvider = "data")
public void bookTicket(String sourse,String dest) {
	System.out.println("From: "+ sourse+"\tTo:"+dest);
	
}
@DataProvider
public Object[][]data(){
	Object[][]obj = new Object[3][2];
	obj[0][0]="hyd";
	obj[0][1]="Goa";
	
	obj[1][0]="shiridi";
	obj[1][1]="thirupathi";
	
	obj[2][0]="bangalore";
	obj[2][1]="warangal";
	return obj;
}
}
