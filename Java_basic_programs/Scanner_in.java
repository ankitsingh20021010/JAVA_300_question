import java.util.Scanner;
public class Scanner_in{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int num1=sc.nextInt();
    System.out.println("You have enterd " + num1);

    System.out.println("Please enter your name- ");
    String name=sc.next();
    System.out.println("You have enter " + name);
  }
}

  
    
