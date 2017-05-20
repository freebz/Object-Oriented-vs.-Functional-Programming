// CHAPTER 2 SOLID Principles

// Lambda-Enabled SOLILD Principles

// The Single-Responsibility Principle

// Example 2-1. Counting prime numbers with multiple responsibilities in a method

public long countPrimes(int upTo) {
	long tally = 0;
	for (int i = 1; i < upTo; i++) {
		boolean isPrime = true;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			tally++;
		}
	}
	return tally;
}
