import java.util.ArrayList;
public class Queue{
    ArrayList<Person> people = new ArrayList<Person>();
    
    public Queue() {
    }
    public void insertPerson(String first, String last, int age){
        Person body = new Person(first,last, age);
        people.add(body);
        return;
    }
    public void printAll() {
        for (Person body : people){
            System.out.println(body.getFirstName());
            System.out.println(body.getLastName());
            System.out.println(body.getAge());
        }
    }
    public void quickSort(){

    }
}