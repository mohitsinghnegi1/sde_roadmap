package design_pattern.memonto_pattern.model;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class HistoryManager {

    private List<State> history = new ArrayList<>();
    HistoryManager(State initialState){
        history.add(initialState);
    }
    private int ptr = -1;

    public State undo() {

        if(ptr==0) history.get(0); // Returning initial state

        ptr-=1;
        return history.get(ptr);
    }

    @SneakyThrows
    public State redo() {
        if(ptr<history.size()-1) ptr+=1;
        return history.get(ptr);
    }

    public void saveContent(State content) {
        int last = history.size()-1;
        while(last!=ptr){
            history.remove(last);
            last-=1;
        }

        history.add(content);
        ptr = history.size()-1;
        System.out.println(history);
    }

    public State getPrevState(){
        return history.get(ptr>=0?ptr:0);
    }
}
