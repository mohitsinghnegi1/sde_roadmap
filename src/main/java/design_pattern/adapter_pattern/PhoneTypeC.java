package design_pattern.adapter_pattern;

public class PhoneTypeC {

    void charge(ITypeCCharger charger){
        charger.typeCCharge();
    }

}
