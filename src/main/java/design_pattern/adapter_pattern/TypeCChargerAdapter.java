package design_pattern.adapter_pattern;

public class TypeCChargerAdapter implements ITypeCCharger {

    TypeBCharger typeBCharger = new TypeBCharger();

    @Override
    public void typeCCharge() {
        // Do some transformation of type c charge to type b
        typeBCharger.typeBCharge();
    }
}
