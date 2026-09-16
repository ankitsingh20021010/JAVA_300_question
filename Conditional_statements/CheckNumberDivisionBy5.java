import java.util.Scanner;
public class CheckNumberDivisionBy5{
   public static void main(String[] args){
    Scanner input=new Scanner(System.in);
      int num;
      System.out.print("Enter any Number");
      num=input.nextln();

      if(num%5==0){
         System.out.println(num + " is divisible by 5");
      }
      else{
         System.out.println(num + "is not divisible by 5");
      }
      
   }
}
