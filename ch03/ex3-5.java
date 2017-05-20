// Example 3-5. A macro consists of a sequence of actions that can be invoked in turn

class Macro {

	private final List<Action> actions;

	public Macro() {
		actions = new ArrayList<>();
	}

	public void record(Action action) {
		actions.add(action);
	}

	public void run() {
		actions.forEach(Action::perform);
	}

}
