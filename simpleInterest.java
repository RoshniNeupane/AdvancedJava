//Write a java program to calculate simple interest using command line arguments.

import java.util.Scanner;
public class simpleInterest{
    public static void main(String[]args){
      if(args.length==3){
        int principal=Integer.parseInt(args[0]);
        double rate=Double.parseDouble(args[1]);
        int time=Integer.parseInt(args[2]);
        System.out.println("SI is:"+principal*rate*time/100);
      }

  }


        //   principal=scanner.nextInt();

        //   System.out.println("Enter rate");
        //   rate=scanner.nextDouble();

        //   System.out.println("Enter time");
        //   time=scanner.nextInt();
       
        //   System.out.println("SI is:"+principal*rate*time/100);
    
    
    
      }

  // }

