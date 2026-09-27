//WAP to find sum of even number or odd number 
import java.util.Scanner;
public class SumOfEvenOdd{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int arr[]=new int[10];
    int even=0, odd=0;
    for(int i=0; i<10; i++){
      System.out.println("enter first number:");
      arr[i]=input.nextInt();
      
        if(arr[i]%2==0){
            even=even+arr[i];
        }else{
            odd=odd+arr[i];
        }
        
        
      
    }
    System.out.println("sum of Even number is --->:"+ even);
    System.out.println("sum of odd number is --->:"+ odd);
  }
}
