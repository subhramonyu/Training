package DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PNCDataPrivider {
	
	@DataProvider
	public Object[][] primeNumbers(){
		
		
		return new Object[][] {
			{2,true},{6,false},{19,true},{22,false},{23,true}
		};
		
	}
	
	@Test(dataProvider = "primeNumbers")
	public void testValidatePrime(Integer inputNumber,Boolean expectedResult) {
		System.out.println(inputNumber + " " + expectedResult);
		
		Assert.assertEquals(PrimeNumberChecker.validatePrime(inputNumber), expectedResult);
	}

}
