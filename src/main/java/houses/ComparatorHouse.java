package houses;

import java.util.Comparator;

public class ComparatorHouse implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getCity().length() - o2.getCity().length();
    }
}
