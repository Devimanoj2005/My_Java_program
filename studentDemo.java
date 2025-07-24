import java.util.Scanner;
class student{
    String Name;
    int Rollno;
    int Mark;
    
public void hasName(String Name)
 {
     System.out.println("Name:"+ Name);
 }
    public void hasRollno(int Rollno)
 {
    System.out.println("Rollno:"+ Rollno);
 }
    public void hasmark(int mark)
 {
    System.out.println("Mark:"+ Mark);
 }
   }
public class studentDemo{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the NAME: ,ROLLNO:,MARK:  ");
        String Name=Sc.nextLine();
        int Rollno=Sc.nextInt();
        int Mark =Sc.nextInt();
    student Mystudent =new student();
    Mystudent.Name=Name;
    Mystudent.Rollno=Rollno;
    Mystudent.Mark=Mark;

    Mystudent.hasName(Name);
    Mystudent.hasRollno(Rollno);
    Mystudent.hasmark(Mark);

    }
}

