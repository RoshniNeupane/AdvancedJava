import java.util.Scanner;

public class Student {
    public static void main(String[]args){
         Scanner scan=new Scanner(System.in);
        String name;
        int roll;
        double marks;
        //  Student(String name,int roll,double marks){
        //     this.name=name;
        //     this.roll=roll;
        //     this.marks=marks;

        // }
       
        System.out.println("Enter your Name");
         name=scan.nextLine();
         System.out.println("Enter rollno");
         roll=scan.nextInt();
         System.out.println("Enter your marks");
         marks=scan.nextDouble();
    
        System.out.println("Student Details is"+ name+ roll+ marks);

    }
}
