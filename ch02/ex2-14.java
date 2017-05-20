// Example 2-14. The definition of withLinesOf

private <T> T withLinesOf(
						  Reader input,
						  Function<Stream<String>, T> handler,
						  Function<IOException, RuntimeException> error) {

	try (BufferedReader reader = new BufferedReader(input)) {
		return handler.apply(reader.lines());
	} catch (IOException e) {
		throw error.apply(e);
	}
}
