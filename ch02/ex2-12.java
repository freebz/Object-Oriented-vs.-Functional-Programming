// The Dependency-Inversion Principle

// Example 2-12. Parsing the headings out of a file

public List<String> findHeadings(Reader input) {
	try (BufferedReader reader = new BufferedReader(input)) {
		return reader.lines()
			.filter(line -> line.endsWith(":"))
			.map(line -> line.substring(0, line.length() - 1))
			.collect(toList());
	} catch (IOException e) {
		throw new HeadingLookupException(e);
	}
}
