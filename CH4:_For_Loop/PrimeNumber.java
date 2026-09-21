//WAP to Find Prime or not prime
import java.util.Scanner;
public class PrimeNumber{
public static void main(String[] args){
  int count =0;
  Scanner input=new Scanner(System.in);
  System.out.print("Enter Number: ");
  int num=input.nextInt();
  for(int i=1; i<=num; i++){
    if(num%i==0){
      count++;
    }
  }
  if(count==2){
    System.out.println("Prime number");
  }
  else{
    System.out.println("Not Prime");
  }
}
}
