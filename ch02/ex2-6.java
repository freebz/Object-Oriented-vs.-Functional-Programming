// Example 2-6. A ThreadLocal date formatter

// One implementation
ThreadLocal<DateFormat> localFormatter
	= ThreadLocal.withInitial(SimpleDateFormat::new);

// Usange
DateFormat formatter = localFormatter.get();
