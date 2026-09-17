//WAP to print of two numbers until user enters "NO"
import java.util.Scanner;
public class AdditionUsingDoWhile{
  public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    int userChoise;
    do{
      System.out.print("Enter First ");
      int num1=input.nextInt();
      System.out.print("Enter second Number ");
      int num2=input.nextInt();
      System.out.println("Sum of Numbers are: " + (num1+num2));
      System.out.print("enter 1 to more operation \n enter 0 to exit \n ");
      userChoise=input.nextInt();
    } while(userChoise==1);
  }
}
