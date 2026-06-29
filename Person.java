public class Person {
    private String fName;
    private String lName;
    private int age;
    
    //Constructor
    public Person(String firstName, String lastName, int years) {
        this.fName = firstName;
        this.lName = lastName;
        this.age = years;
    }

    //Getters and Setters
    public String getFirstName() {
        return this.fName;
    }
    public void setFirstName(String newName) {
        this.fName = newName;
    }

    public String getLastName() {
        return this.lName;
    }
    public void setLastName(String newName) {
        this.lName = newName;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
}
