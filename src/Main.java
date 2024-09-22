import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Василий", 25));
        persons.add(new Person("Иван", 23));
        persons.add(new Person("Павел", 15));
        persons.add(new Person("Алексей", 55));
        persons.add(new Person("Нина", 45));
        persons.add(new Person("Дмитрий", 27));
        persons.add(new Person("Ольга", 15));
        persons.add(new Person("Лариса", 35));

        IOPerson.personWrite(persons, "person.data");

        List<Person> personsLoad = (List<Person>) IOPerson.personRead("person.data");
        System.out.println(personsLoad);
    }
}