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

        System.err.println("MY DETALIES");
        System.out.println("Full Name: " +  Name);
        System.out.println("Age: " + Age );
        System.out.println("Mobile number: " +  MobileNumber  );
        System.out.println("CGPA: " + Cgpa );
        System.out.println("Attandence Mark:  " +  Attendence + " .");




    }
}
