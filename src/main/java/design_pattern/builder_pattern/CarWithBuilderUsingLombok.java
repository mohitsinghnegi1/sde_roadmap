package design_pattern.builder_pattern;

import design_pattern.builder_pattern.car_components.*;
import lombok.Builder;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Builder
public class CarWithBuilderUsingLombok {

    // Required
    @NonNull
    @Builder.Default
    private List<Seat> seats = new ArrayList<>();
    @NonNull
    private Engine engine;
    @NonNull
    private List<Tyre> tyre;

    // optional
    private SunRoof sunRoof;
    private MusicSystem musicSystem;
}
