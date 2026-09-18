//WAP to table any n number 
import java.util.Scanner;
public class TableofN{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
  System.out.print("Enter number N: ");
  int n=input.nextInt();
  for(int i=1; i<=10; i++){
  System.out.println(i + "+" + n + "="+ i*n);
  }
}
}
