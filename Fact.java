package Module1;
import java.util.Scanner;
public class Fact {
	public static void main(String[] ary) {
		int fact =1;
		Scanner Sc = new Scanner(System.in);
	
		System.out.println("enter the positive number: ");
		int no =Sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of " + no + "is " + fact);

}
}