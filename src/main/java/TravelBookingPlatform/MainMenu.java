package TravelBookingPlatform;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MainMenu {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        typeOfDeparture, airport, direction, stay, departureFrom, numberOfContestants
    }

}
