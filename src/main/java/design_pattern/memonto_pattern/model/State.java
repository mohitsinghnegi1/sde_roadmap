package design_pattern.memonto_pattern.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class State {
    private String content = "";

    public void display() {
        System.out.println("Content : "+content);
    }

    @Override
    public boolean equals(Object obj){

        State state2 = (State) obj;
        return state2.content.equals(content);
    }
}
