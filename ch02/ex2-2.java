// Example 2-2. Counting prime numbers after refactoring out the isPrime check

public long countPrimes(int upTo) {
	long tally = 0;
	for (int i = 1; i < upTo; i++) {
		if (isPrime(i)) {
			tally++;
		}
	}
	return tally;
}

private boolean isPrime(int number) {
	for (int i = 2; i < number; i++) {
		if (number % i == 0) {
			return false;
		}
	}
	return true;
}
