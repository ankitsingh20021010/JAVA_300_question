//WAP to print PalindromeNumber 
import java.util.Scanner;
public class PalindromeNumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
      System.out.print("ENTER NUMBER: ");
    int num=input.nextInt();
    int reverse=getReverseNumber(num);
    if(num==reverse){
      System.out.print("Yes Palindrome");
    }
    else{
         System.out.print("No it's not a Palindrome Number");   
    }
  }
  //this is a method and we also called a funtion in c laguage python def keyword as it is 
      static int getReverseNumber(int num){
        int reverse=0, lastDigit;
        while(num!=0){
          lastDigit=num%10;
          reverse=reverse *10 + lastDigit;
          num=num/10;
        }
        return reverse;
      
      }
  }
