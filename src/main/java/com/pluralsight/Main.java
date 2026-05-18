import com.pluralsight.Helpers.FormatHelpers;
import com.pluralsight.model.Person;

public static void main(String[] args){
    List<Person> connections = new ArrayList<>();

    connections.add(new Person("John", "Smith", 28));
    connections.add(new Person("Sarah", "Johnson", 34));
    connections.add(new Person("Michael", "Brown", 22));
    connections.add(new Person("Emily", "Davis", 30));
    connections.add(new Person("David", "Wilson", 41));
    connections.add(new Person("Emily", "Aer", 20));
    connections.add(new Person("Sarah", "Johnson", 18));


    connections.sort(Person::compareTo);




    System.out.println("//");
    for(Person p : connections){
        FormatHelpers.formatHelperConnection(p);

    }









}
