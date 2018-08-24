package DataProvider;

public class PrimeNumberChecker {

	public static Boolean validatePrime(final Integer primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;

	}

}
