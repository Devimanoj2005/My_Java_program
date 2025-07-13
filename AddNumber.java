import java.util.Scanner;


public class AddNumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstnumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondnumber = sc.nextInt();
        int sum = firstnumber + secondnumber;
        System.out.println("The sum is: " + sum);
    }

}

