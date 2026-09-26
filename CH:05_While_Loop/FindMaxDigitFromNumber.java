//page no 70 --> WAP to find max number in a number like 546 return 6 
import java.util.Scanner;
public class FindMaxDigitFromNumber{
  public static void main(String[] args){
    Scanner input =new Scanner (System.in);
    System.out.print("Enter number: ");
    int num= input.nextInt();
    int lastDigit,max=num % 10;
    while(num!=0){
      lastDigit=num %10;
     if(lastDigit > max){
         max=lastDigit;
     }
      num=num/10;  
    }
    System.out.println(max);
  }
}
