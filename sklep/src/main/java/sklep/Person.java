package sklep;

public abstract class Person {
    private int id;
    private String name;
    static int counter;

    public abstract boolean getAuthorization();

    public static int counter() {
        counter = counter + 1;
        return counter;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person() {
        this.id = Person.counter();

    }

}
