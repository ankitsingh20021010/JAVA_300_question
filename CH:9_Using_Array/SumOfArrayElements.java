//WAP to find sum of Array Elements
import java.util.Scanner;
public class SumOfArrayElements{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int arr[]=new int[5];
    int sum=0;
    for(int i=0; i<5; i++){
      System.out.println("enter first number:");
      arr[i]=input.nextInt();
      sum=sum+arr[i];
      
    }
    System.out.println("sum of array is --->:"+ sum);
  }
}
