//WAP to print sum N Number
import java.util.Scanner;
public class SumOfN_Number{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int sum=0;
    System.out.print("Enter N number: ");
    int n=input.nextInt();
    for(int i=1; i<=n; i++){
      sum=sum+i;
    }
    System.out.println(sum);
  }
}
