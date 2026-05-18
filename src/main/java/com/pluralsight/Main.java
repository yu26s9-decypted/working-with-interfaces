import com.pluralsight.model.Person;

public static void main(String[] args){
    List<Person> connections = new ArrayList<>();

    connections.add(new Person("John", "Smith", 28));
    connections.add(new Person("Sarah", "Johnson", 34));
    connections.add(new Person("Michael", "Brown", 22));
    connections.add(new Person("Emily", "Davis", 30));
    connections.add(new Person("David", "Wilson", 41));

    System.out.println(connections);
}
