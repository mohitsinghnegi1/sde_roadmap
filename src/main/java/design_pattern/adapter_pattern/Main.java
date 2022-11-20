package design_pattern.adapter_pattern;

public class Main {

    public static void main(String[] args) {
        PhoneTypeC phoneTypeC = new PhoneTypeC();

        // Get Type C charger
        // Since we dont have type c charger
        // We will use adapter which implement typeC charger interface

        phoneTypeC.charge(new TypeCChargerAdapter());
    }
}
