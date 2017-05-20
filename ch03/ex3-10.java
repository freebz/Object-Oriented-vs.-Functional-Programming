// Example 3-10. Using the gzip algorithm to compress data

class GzipCompressionStrategy implements CompressionStrategy {

	@Override
	public OutputStream compress(OutputStream data) throws IOException {
		return new GZIPOutputStream(data);
	}

}
