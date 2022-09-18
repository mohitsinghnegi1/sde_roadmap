package design_pattern.builder_pattern;

import design_pattern.builder_pattern.car_components.Engine;
import design_pattern.builder_pattern.car_components.Tyre;
import junit.framework.TestCase;

import java.util.Arrays;

import static design_pattern.builder_pattern.CarWithBuilder.builder;

public class CarWithBuilderTest extends TestCase {

    public void testBuilder() throws Exception {
        CarWithBuilder carWithBuilder = builder()
                .engine(new Engine())
//                .seats(new ArrayList<>()) // Not required as i already set the default
                .tyre(Arrays.asList(new Tyre())).build();
        System.out.println(carWithBuilder);
    }
}