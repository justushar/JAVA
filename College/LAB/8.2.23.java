import java.util.Scanner;
public class Student_interface{

        public class Student
    {
        int roll_no;
        Scanner sc=new Scanner(System.in);
        void put_no()
        {
            System.out.println("Enter the roll no: ");
            roll_no=sc.nextInt();
        }
        
        void get_no()
        {
            System.out.println("The roll number is: "+roll_no);
        }

    }

    public class Test extends Student
    {
        int M1;
        int M2;
        int total=0;
        void put_marks()
        {
            System.out.println("Enter the marks of Subject 1: ");
            M1=sc.nextInt();
            
            System.out.println("Enter the marks of Subject 2: ");
            M2=sc.nextInt();
            total=M1+M2;
        }
        

        void get_marks()
        {
            System.out.println("The marks of Subject 1 is: "+M1);
            System.out.println("The marks of Subject 2 is: "+M2);
        }

    }

    public interface sports
    {
        int sport_wt=6;
        void put_Wt();
    }

    public class Result extends Test implements sports
    {   
        public void put_Wt()
        {
            System.out.println("Sports weight is: "+sport_wt);
        }
        
        void display()
        {
            System.out.println("Total is: "+total);
        }
    
    }
    public static void main(String[] args)
    {
        Student_interface i=new Student_interface();
        
        Result r1=i.new Result();
        r1.put_no();
        r1.get_no();
        r1.put_marks();
        r1.get_marks();
        r1.put_Wt();
        r1.display();
    }

}

