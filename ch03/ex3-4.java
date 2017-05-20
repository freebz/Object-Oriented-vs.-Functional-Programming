// Example 3-4. Our open action also delegates to the underlying method call on Editor

class Open implements Action {

	private final Editor editor;

	public Open(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void perform() {
		editor.open();
	}
}
