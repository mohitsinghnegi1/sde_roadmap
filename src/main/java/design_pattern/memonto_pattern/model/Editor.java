package design_pattern.memonto_pattern.model;

public class Editor {

    private final HistoryManager historyManager;
    State state;

    Editor(HistoryManager historyManager){
        this.historyManager = historyManager;
        this.state = historyManager.getPrevState();
    }

    public void saveContent(State curState){

        if(state.equals(curState)) return;
        this.state = curState;
        this.historyManager.saveContent(state);
        // comment

    }

    public void undo(){
        this.state = historyManager.undo();
    }

    public void redo(){
        this.state = historyManager.redo();
    }

    public void printContent(){
        this.state.display();
    }
}
