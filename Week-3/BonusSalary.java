import java.util.*;
public class BonusSalary {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double fs = scanner.nextDouble();
        double ts = scanner.nextDouble();

        double total = fs + (ts * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);

        scanner.close();
    }
    
}