// Example 2-13. The domain logic with file handling split out

public List<String> findHeadings(Reader input) {
	return withLinesOf(
					   input,
					   lines -> lines.filter(line -> line.endsWith(":"))
					   .map(line -> line.substring(0, line.length()-1))
					   .collect(toList()),
					   HeadingLookupException::new);
}
