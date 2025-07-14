packageModule1;
import java.util.Scanner;

public class TernaryOpratorDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int secondNumber = sc.nextInt();

        int bigNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;

        System.out.println("I am " + bigNumber + ", the Big Number");
    }
}

