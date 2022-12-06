public class StaticKeyword {
    //static variables
    static int age = 26;
    static String name = "Darshan";

    //static Block
    
    static {
        display();
    }

    //Static Method
    static void display() {
        System.out.println(age + " " + name);
    }

    //Main Method

    public static void main(String[] args) {
        display();
    }
}
