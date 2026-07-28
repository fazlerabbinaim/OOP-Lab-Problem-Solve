import java.util.*;

class Singleton {
    public String str;

    private static Singleton singleInstance = null;

    private Singleton() {};

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            Singleton instance = Singleton.getSingleInstance();
            instance.str = input;
            System.out.println("Hello I am a singleton! Let me say " + instance.str + " to you");
        }
        scanner.close();
    }
}