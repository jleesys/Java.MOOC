package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (((name == null))
                || name.isEmpty()
                || (name.length() > 40))
        //|| !((age >= 0) && (age <= 120))) {
        {
            throw new IllegalArgumentException("Exception name haheheheh");
        }
        if (age < 0 || age > 120) {//(!(age >= 0 & age <= 120)) {
            throw new IllegalArgumentException("Exception age mothafucka");
        }
        this.name = name;
        this.age = age;
        System.out.println("we got to the end");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
