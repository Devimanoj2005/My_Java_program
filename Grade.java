import java.util.Scanner;
public class Grade{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int MarkGot = sc.nextInt();
        
        if(MarkGot >= 90)
        {
            System.out.println("Grade = S");
        }
        else if(MarkGot < 90 && MarkGot >= 85)
        {
            System.out.println("Grade = A+");
        }
        else if(MarkGot < 85 && MarkGot >= 75)
        {
            System.out.println("Grade = A");
        }
        else if(MarkGot < 75 && MarkGot >= 60)
        {
          System.out.println("Grade = B");
        }
        else if(MarkGot < 60 && MarkGot >= 50)
        {
          System.out.println("Grade = C");
        }
        else if(MarkGot <= 50 && MarkGot >= 40) 
        {
            System.out.println("You FAIL");

        }
       else if(MarkGot < 40 && MarkGot >= 0)
       {
           System.out.println("Invalid Grade");
       }
System.out.println("The Student got " + MarkGot + " marks.");
        
    }
    
}