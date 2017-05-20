// Example 2-7. A ThreadLocal identifier

// Or...
AtomicInteger threadId = new AtomicInteger();
ThreadLocal<Integer> localId
	= ThreadLocal.withInitial(() -> threadId.getAndIncrement());

// Usage
int idForThisThread = localId.get();
