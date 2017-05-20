// Example 3-3. Our save action delegates to the underlying method call on Editor

class Save implements Action {

	private final Editor editor;

	public Save(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void perform() {
		editor.save();
	}
}
