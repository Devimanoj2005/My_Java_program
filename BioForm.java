import java.util.Scanner;
public class BioForm{
    public static void main(String[] arg){
       Scanner Sc= new Scanner(System.in);
       System.out.println("ENTER YOUR FULL NAME: ");
       String Name= Sc.nextLine();
       System.out.println("ENTER YOUR AGE: ");
       int Age = Sc.nextInt();
       System.out.println("ENTER YOUR MOBILE NUMEBER: ");
       long MobileNumber = Sc.nextLong();
       System.out.println("ENTER YOUR CGPA: ");
       Double Cgpa = Sc.nextDouble();
       System.out.println("ENTER YOUR PERSENTAGE OF ATTANDANCE: ");
       float Attendence = Sc.nextFloat();



    }
}