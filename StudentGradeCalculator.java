import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextInt();
        }

        double avg = total / (double)n;
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + avg);

        if (avg >= 90) System.out.println("Grade = A");
        else if (avg >= 75) System.out.println("Grade = B");
        else if (avg >= 50) System.out.println("Grade = C");
        else System.out.println("Grade = F");

        sc.close();
    }
}
