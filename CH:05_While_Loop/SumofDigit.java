//page no 70 --> WAP to sumofdigit like 5232 = 17 using while loop (5 + 2 + 3 + 2 = 17);
import java.util.Scanner;
public class SumofDigit{
  public static void main(String[] args){
    Scanner input =new Scanner (System.in);
    System.out.print("Enter number: ");
    int num= input.nextInt();
    int lastDigit,sum=0;
    while(num!=0){
      lastDigit=num %10;
      sum=sum + lastDigit;
      num=num /10;
    }
    System.out.println(sum);
  }
}
