//WAP to find greatest number from an array 
import java.util.Scanner;
public class MaxNumberFromArray{
  public static void main(String[]args){
  Scanner input=new Scanner(System.in);
    int arr[]=new int[6];
    int max=0;
    for(int i=0; i<=5; i++){
      System.out.println("enter number : " + i);
      arr[i]=input.nextInt();
      if(max<arr[i]){
        max=arr[i];
      }
    }
    System.out.println("Max number in array is -->: "+ max);
    
  }
}
