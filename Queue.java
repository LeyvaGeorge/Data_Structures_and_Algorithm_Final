import java.util.ArrayList;
public class Queue{
    ArrayList<Person> people = new ArrayList<Person>();
    int size = 0;
    
    public Queue() {
    }
    public void insertPerson(String first, String last, int age){
        Person body = new Person(first,last, age);
        people.add(body);
        size++;
        return;
    }
    public void printAll() {
        for (Person body : people){
            System.out.println(body.getFirstName());
            System.out.println(body.getLastName());
            System.out.println(body.getAge());
        }
    }
    //call sort to check if sort is empty or contains one element.
    public void sortbyLastName(){
        if(this.size < 2) {
            System.out.println("Please two or more to be able to sort through.");
            return;
        }
        sortbyLastName(0,this.size - 1);
    }
    public void sortbyLastName(int lowIndex, int highIndex){
        //Base Case: if the partition size is 1 or Zero
        if (lowIndex >= highIndex){
            return;
        }
        //Parition the data within the array.
        int lowEndIndex = partitionLastName(lowIndex,highIndex);
        
        //Recursively sort low partition (lowIndex to lowEndIndex) and high parition (lowEndIndex + 1 to highIndex)
        sortbyLastName(lowIndex, lowEndIndex);
        sortbyLastName(lowEndIndex + 1, highIndex);
    }
    public int partitionLastName(int lowIndex, int highIndex){
        //Pick middle element as pivot
        int midpoint = lowIndex + (highIndex-lowIndex)/2;
        String pivot = people.get(midpoint).getLastName();
        boolean done = false;
        while (!done) {
            //Increment lowIndex to find a string that is greater than itself
            while (people.get(lowIndex).getLastName().compareTo(pivot) < 0){
                lowIndex++;
            }
            //Decrements highIndex to find a string that is less than itself
            while (pivot.compareTo(people.get(highIndex).getLastName()) < 0){
                highIndex--;
            }
            //if zero or one elemnt remains, then all numbers are partitioned. return highIndex.
            if (lowIndex >= highIndex){
                done = true;
            }
            //Swap people[lowIndex] with people[highIndex]
            else {
                //Temporary value to hold the person getting swapped
                String tempFName = people.get(lowIndex).getFirstName();
                String tempLName = people.get(lowIndex).getLastName();
                int tempAge = people.get(lowIndex).getAge();
                
                //Swap people[lowIndex] and people[highIndex]
                people.get(lowIndex).setFirstName(people.get(highIndex).getFirstName());
                people.get(lowIndex).setLastName(people.get(highIndex).getLastName());
                people.get(lowIndex).setAge(people.get(highIndex).getAge());

                //Assign new highIndex person
                people.get(highIndex).setFirstName(tempFName);
                people.get(highIndex).setLastName(tempLName);
                people.get(highIndex).setAge(tempAge);
                
                //Update lowIndex and highIndex
                lowIndex++;
                highIndex--;
            }
        }
        return highIndex;
    }
    public void sortbyAge(){

    }
}