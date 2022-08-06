

// implements Comparable<Object Type> ... Comparable<Literature>
public class Literature implements Comparable<Literature> {

    private String name;
    private int ageRec;
    public Literature(String name,int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.ageRec;
    }
    public String toString() {
        return this.name + " (recommended for " + this.ageRec + " year-olds or older)";
    }

    @Override
    public int compareTo(Literature o) {
        return this.ageRec - o.getAge();
    }
}
