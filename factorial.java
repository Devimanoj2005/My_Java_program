import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
    int fact=1,i=1;
    System.out.println("Enter the positive number");
    int n = Sc.nextInt();
    while(i<=n){
        fact=fact*i;
        i++;
    }
    System.out.println(fact);



    }
}