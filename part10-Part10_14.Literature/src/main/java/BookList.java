import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class BookList {
    private List<Literature> list;

    public BookList() {
        this.list = new ArrayList<>();
    }

    public void add(Literature lit) {
        this.list.add(lit);
    }

    public int size() {
       return this.list.size();
    }

    // the default method of sort. sorts by the method defined in Literature: sorting by ageRecommendation in
    // ascending order. method name Literature.compareTo(Literature comparison)
    // note: interface Comparable NECESSITATES THE METHOD compareTo(Object object)
    public void sortByAge() {
//        this.list = this.list.stream().sorted().collect(Collectors.toList());
        Collections.sort(this.list);
    }

    // secondary method of sorting. sorts by age in ascending order, within each age group, sort alphabetically
    // works by passing a comparator method CompareByAgeAndName.compare(Literature 1, Literature 2)
    // interface comparator NECESSITATES THE METHOD compare(Object 1, Object2)
    public void sortByAgeAndName() {
        Collections.sort(this.list,new CompareByAgeAndName());
    }
    @Override
    public String toString() {
        StringBuilder books = new StringBuilder();
        Iterator<Literature> iterator = this.list.iterator();
        while (iterator.hasNext()) {
        books.append(iterator.next() + "\n");
        }
        java.lang.String output = books.toString();
        return output;
    }
}
