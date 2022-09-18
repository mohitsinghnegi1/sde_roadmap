package design_pattern.builder_pattern;

import design_pattern.builder_pattern.car_components.*;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class CarWithBuilder {
    // required
    private List<Seat> seats = new ArrayList<>();
    private Engine engine;
    private List<Tyre> tyre;

    // optional
    private SunRoof sunRoof;
    private MusicSystem musicSystem;

    public static Builder builder(){
        return new Builder();
    }



    public static class Builder{
        // required
        private List<Seat> seats = new ArrayList<>();
        private Engine engine;
        private List<Tyre> tyre;

        // optional
        private SunRoof sunRoof;
        private MusicSystem musicSystem;

        public Builder withSeats(@NonNull final List<Seat> seats){
            this.seats = seats;
            return this;
        }

        public Builder engine(@NonNull final Engine engine){
            this.engine = engine;
            return this;
        }

        public Builder tyre(@NonNull final List<Tyre> tyre){
            this.tyre = tyre;
            return this;
        }

        public Builder sunRoof(@NonNull final SunRoof sunRoof){
            this.sunRoof = sunRoof;
            return this;
        }

        public Builder musicSystem(@NonNull final MusicSystem musicSystem){
            this.musicSystem = musicSystem;
            return this;
        }

        public CarWithBuilder build() throws Exception {
            if(engine==null || seats ==null ||  tyre==null ){
                throw new Exception("Engine or seats or type can't be Null");
            }
            // Put a null check here
            CarWithBuilder carWithBuilder = new CarWithBuilder();
            carWithBuilder.engine = engine;
            carWithBuilder.seats = seats;
            carWithBuilder.tyre = tyre;
            carWithBuilder.musicSystem = musicSystem;
            carWithBuilder.sunRoof = sunRoof;

            return carWithBuilder;

        }
    }
}
