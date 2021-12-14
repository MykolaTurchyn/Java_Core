package demo4;

import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> club;

    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

//    public static void setClub(Map<Person, List<Pet>> club) {
//        this.club = club;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZooClub)) return false;

        ZooClub zooClub = (ZooClub) o;

        return club != null ? club.equals(zooClub.club) : zooClub.club == null;
    }

    @Override
    public int hashCode() {
        return club != null ? club.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
