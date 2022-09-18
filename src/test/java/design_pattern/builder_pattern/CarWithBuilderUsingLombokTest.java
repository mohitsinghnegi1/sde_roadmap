package design_pattern.builder_pattern;

import design_pattern.builder_pattern.car_components.Engine;
import design_pattern.builder_pattern.car_components.Tyre;
import junit.framework.TestCase;

import java.util.Arrays;

public class CarWithBuilderUsingLombokTest extends TestCase {

    public void testBuilder() {
        CarWithBuilderUsingLombok carWithBuilderUsingLombok = CarWithBuilderUsingLombok.builder()
                .engine(new Engine())
//                .seats(new ArrayList<>()) // Not required as i already set the default
                .tyre(Arrays.asList(new Tyre())).build();
        System.out.println(carWithBuilderUsingLombok);


    }
}