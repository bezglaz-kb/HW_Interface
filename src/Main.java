import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("SimpleLogger");
        Logger simple = new SimpleLogger();
        simple.log("Hello");
        simple.log("World");

        System.out.println();
        System.out.println("SmartLogger");
        Logger smart = new SmartLogger();
        smart.log("Hello");
        smart.log("World");
        smart.log("Error1");
        smart.log("erRor2");
        smart.log("ERROR3");
        smart.log("4error");
    }
}
