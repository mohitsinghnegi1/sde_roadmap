package design_pattern.composit_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    private final String name;
    private List<IComponent> components = new ArrayList<>();

    Composite(String name){
        this.name = name;
    }
    
    @Override
    public Integer getCost() {
        Integer totalPrice = 0;

        for(IComponent component:components){
            totalPrice +=component.getCost();
        }

        System.out.println("Cost of "+name+" is "+totalPrice);
        return totalPrice;
    }

    void addComponents(IComponent component){
        components.add(component);
    }
}
