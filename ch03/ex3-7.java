// Example 3-7. Using lambda expressions to build up a macro

Macro macro = new MacrO();
macro.record(() -> editor.open());
macro.record(() -> editor.save());
macro.record(() -> editor.close());
macro.run();
