package study.racingCarRemaster.model;

import java.util.Objects;

public class Location {
    private int location;

    public Location(final int location) {
        this.location = location;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        final Location location1 = (Location) o;
        return location == location1.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}
