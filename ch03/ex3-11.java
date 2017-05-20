// Example 3-11. Using the zip algorithm to compress data

class ZipCompressionStragegy implements CompressionStrategy {

	@Override
	public OutputStream compress(OutputStream data) throws IOException {
		return new ZipOutputStream(data);
	}

}
