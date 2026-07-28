import java.util.*;

public class Salary{
    public  static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        double s = input.nextFloat();

        System.out.println("NUMBER = "+ a);
        System.out.printf("SALARY = U$ %.2f\n",b * s);
    }
}