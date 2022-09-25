package design_pattern.memonto_pattern.model;

import junit.framework.TestCase;

public class EditorTest extends TestCase {

    Editor editor;

    public void setUp() throws Exception {
        super.setUp();
        State state  = new State("");
        editor = new Editor(new HistoryManager(state));
    }

    public void testSaveContent() {
        editor.saveContent(new State(""));
        editor.saveContent(new State("1"));
        editor.saveContent(new State("2"));
        editor.saveContent(new State("3"));
        editor.saveContent(new State("3"));
        editor.saveContent(new State("4"));
        editor.saveContent(new State("5"));

        editor.printContent();

        editor.redo(); // Should not update the content
        editor.printContent();
        editor.undo();
        editor.printContent();
        editor.undo();
        editor.printContent();
        editor.undo(); // Should come to 2

        editor.printContent();

        editor.redo();
        editor.redo();
        editor.redo();
        editor.redo();
        editor.printContent(); // Should be at 5

        editor.undo();
        editor.undo(); // Now at 3
        editor.printContent();

        editor.saveContent(new State("6"));
        editor.printContent();


    }

}