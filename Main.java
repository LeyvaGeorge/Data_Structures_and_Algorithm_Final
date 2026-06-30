public class Main {
    public static void main(String[] args) {
        Queue room = new Queue();
        room.insertPerson("James","Smith", 25);
        room.insertPerson("Bethany", "Dove", 21);
        room.insertPerson("Juan", "Sanchez",36);
        room.insertPerson("Billy","Hasson", 30);
        room.insertPerson("Valerie", "Newman", 34);
        room.printAll();
        System.out.println("=================================");
        room.sortbyLastName();

        room.printAll();
        
    }
}
