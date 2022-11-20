package design_pattern.composit_design_pattern;

public class Main {
    public static void main(String[] args) {
        Leaf ram = new Leaf("ram",1000);
        Leaf cpu = new Leaf("cpu",2000);

        Composite mb = new Composite("mb");
        mb.addComponents(ram);
        mb.addComponents(cpu);


        Leaf mouse = new Leaf("mouse",500);
        Leaf kb = new Leaf("kb",600);

        Composite peri = new Composite("peri");
        peri.addComponents(mouse);
        peri.addComponents(kb);

        Composite computer = new Composite("computer");
        computer.addComponents(peri);
        computer.addComponents(mb);

        computer.getCost();
    }
}
