// Strategy Pattern

// Example 3-9. Defining a strategy interface for compressing data

interface CompressionStrategy {

	OutputStream compress(OutputStream data) throws IOException;

}
