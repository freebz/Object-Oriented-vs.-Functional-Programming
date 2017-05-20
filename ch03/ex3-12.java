// Example 3-12. Our compressor is provided with a compression strategy at construction time

class Compressor {

	private final CompressionStrategy strategy;

	public Compressor(CompressionStrategy strategy) {
		this.strategy = strategy;
	}

	public void compress(Path inFile, File outFile) throws IOException {
		try (OutputStream outStream = new FileOutputStream(outFile)) {
			Files.copy(inFile, strategy.compress(outStream));
		}
	}
}
