import java.util.Scanner;

public class SwapTwoVariables{
   public static void main(String[] args){
   Scanner input=new Scanner(System.in);

     System.out.print("Enter 1st number");
     int num1 = input.nextInt();

      System.out.print("Enter 2nd number");
     int num2 = input.nextInt();


     int num3= num1;
     num1=num2;
     num2=num3;
     System.out.println("After swap \n \n");
     System.out.println("Num1 --> " + num1);
     System.out.println("Num2 -->" + num2);
     
 
  }
}
