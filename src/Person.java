public class Person {
    private final String name;
    private final String surname;
    public Person (String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return name + " " + surname;
    }
    public void changePerson(Person person) {
    person = new Person("Ilya","Lagutenko");
        System.out.println("person in changePerson = " + person);
    }
}
