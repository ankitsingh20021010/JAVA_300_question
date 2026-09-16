//WAP to check given number is positive, negative or zero
import java.util.Scanner;
public class PositiveNegative{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number ");
    int num=input.nextInt();
    if(num >0){
      System.out.print("number is positve");
    }
    else if(num==0){
          System.out.print("number is zero");
    }
    else{
          System.out.print("number is Negative");
    }
  }
}
