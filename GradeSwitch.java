import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid mark entered.");
        } else {
            switch (marks/10) {
                case 10:
                case 9:
                    System.out.println("Grade = S");
                    break;

                case 8:
                    if (marks >= 85)
                        System.out.println("Grade = A+");
                    else
                        System.out.println("Grade = A");
                    break;

                case 7:
                    System.out.println("Grade = A");
                    break;

                case 6:
                    System.out.println("Grade = B");
                    break;

                case 5:
                    System.out.println("Grade = C");
                    break;

                case 4:
                    System.out.println("Grade = D (You Just Passed)");
                    break;

                default:
                    System.out.println("You FAIL IN THE EXAM");
                    break;
            }
        }
    }
}
