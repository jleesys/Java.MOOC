import java.util.Comparator;

public class CompareByAgeAndName implements Comparator<Literature> {

    @Override
    public int compare(Literature o1, Literature o2) {
        if (o1.compareTo(o2) == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return o1.compareTo(o2);
    }
}
