package TestNGExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelTest {
  @Test(dataProvider="getData")
  public void f(Object a) {
	  System.out.println(a);
	  
  }
  
  @DataProvider
  public Object[] getData() {
	 Object a[]= {"a1","b2","c3"};
	  
	
	 return a;
  }
}
