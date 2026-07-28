import java.util.*;
public class InceaseSalary {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();

        int percentage = 0;

        if (salary >= 0 && salary <= 400.00) {
            percentage = 15;
        } 
        else if (salary > 400.00 && salary <= 800.00) {
            percentage = 12;
        } 
        else if (salary > 800.00 && salary <= 1200.00) {
            percentage = 10;
        } 
        else if (salary > 1200.00 && salary <= 2000.00) {
            percentage = 7;
        } 
        else if (salary > 2000.00) {
            percentage = 4;
        }

        double earned = salary * percentage / 100.0;
        double newSalary = salary + earned;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", earned);
        System.out.printf("Em percentual: %d %%\n", percentage);

        scanner.close();
    }
    
}