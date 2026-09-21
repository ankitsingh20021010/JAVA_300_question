//WAP to check number is perfect means 6 1 + 2 +3 =6 (A number equal to divisor sum) <-----
import java.util.Scanner;
public class PerfectNumber{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  System.out.print("Enter Number: ");
  int num=input.nextInt();
    int sum=0;
     for(int i=1; i<num; i++){
         if(num%i==0){
             sum=sum+i;
         }
         
     }
    if(num==sum){
        System.out.println("Num is perfect");
    }
    else{
        System.out.println("Num is not perfect");
    }
  } 
}
