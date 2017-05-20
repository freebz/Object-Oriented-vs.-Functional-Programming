// Example 2-3. Counting primes using the Java 8 streams API

public long countPrimes(int upTo) {
	return IntStream.range(1, upTo)
		.filter(this::isPrime)
		.count();
}

private boolean isPrime(int number) {
	return IntStream.range(2, number)
		.allMatch(x -> (number % x) != 0);
}
