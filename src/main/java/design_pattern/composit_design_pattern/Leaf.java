package design_pattern.composit_design_pattern;

public class Leaf implements IComponent{
    private final String name;
    private final Integer price;

    Leaf(String name,Integer price){
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getCost() {
        System.out.println("Cost of "+name+" is "+price);
        return price;
    }
}
