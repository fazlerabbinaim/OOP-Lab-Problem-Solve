import java.util.Scanner;

class Student {
    int[] scores = new int[5];

    void input(Scanner sc) {
        for (int i = 0; i < 5; i++) {
            scores[i] = sc.nextInt();
        }
    }

    int calculateTotalScore() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += scores[i];
        }
        return total;
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].input(sc);
        }
        
        sc.close();

        int kristenScore = students[0].calculateTotalScore();
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (students[i].calculateTotalScore() > kristenScore) {
                count++;
            }
        }

        System.out.println(count);
    }
    
}