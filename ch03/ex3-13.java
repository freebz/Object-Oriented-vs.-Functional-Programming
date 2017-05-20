// Example 3-13. Instantiating the Compressor using concrete strategy classes

Compressor gzipCompressor =
	new Compressor(new GZipCompressionStrategy());
gzipCompressor.compress(inFile, outFile);

Compressor zipCompressor = new Compressor(new ZipCompressionStrategy());
zipCompressor.compress(inFile, outFile);
