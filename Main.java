import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Queue room = new Queue();
        int choice = 0;
        String firstName;
        String lastName;
        int age;
        int i =1;
        Scanner scnnr = new Scanner(System.in);
        System.out.println("People sorting application");
        while(room.size()<5){
            System.out.println(i + ".");
            System.out.print("First name: ");
                try{
                    firstName = scnnr.nextLine();
                }
                catch(Exception e){
                    System.out.println("Unable to read input");
                    continue;
                }
                System.out.print("Last name: ");
                try{
                    lastName = scnnr.nextLine();
                }
                catch(Exception e){
                    System.out.println("Unable to read input");
                    continue;
                }
                System.out.print("Age: " );
                try{
                    age = scnnr.nextInt();
                    if (age < 0 || age > 120){
                        throw new IllegalArgumentException();
                    }
                    room.insertPerson(firstName, lastName, age);
                }
                catch(Exception e){
                    System.out.println("Unable to read input");
                }
                scnnr.nextLine();
                i++;
        }
        System.out.println("========================");
        while (choice != 5){
            System.out.println("    Menu ("+ room.size() +" people in list)" );
            System.out.println("1.Insert new Person \n2.Print All\n3.Sort by Name\n4.Sort by Age\n5.Exit");
            System.out.print("Selection: ");
            
            try{
                choice = scnnr.nextInt();
            }
            catch(Exception e){
                System.out.println("Error must be a an integer value.");
                scnnr.nextLine();
                continue;
            }
            if (choice > 5 || choice <=0){
                System.out.println("Please make a selection from 1 to 5");
            }
            switch (choice){
                case 1:
                    //Flush the leftover newline character from the previous numeric input
                    scnnr.nextLine();
                    System.out.print("First name: ");
                    try{
                        firstName = scnnr.nextLine();
                    }
                    catch(Exception e){
                        System.out.println("Unable to read input");
                        continue;
                    }
                    System.out.print("Last name: ");
                    try{
                        lastName = scnnr.nextLine();
                    }
                    catch(Exception e){
                        System.out.println("Unable to read input");
                        continue;
                    }
                    System.out.print("Age: " );
                    try{
                        age = scnnr.nextInt();
                        if (age < 0 || age > 120){
                            throw new IllegalArgumentException();
                        }
                    }
                    catch(Exception e){
                        System.out.println("Unable to read input");
                        continue;
                    }
                    room.insertPerson(firstName, lastName, age);
                    break;
                case 2:
                    room.printAll();
                    break;
                case 3:
                    room.sortbyLastName();
                    System.out.println("List is now sorted by last name.");
                    break;
                case 4:
                    room.sortbyAge();
                    System.out.println("List is now sorted by age.");
                    break;
                case 5:
                    System.out.println("Exiting out of program.");
                    break;
            }
        }
        scnnr.close();
    }
}
