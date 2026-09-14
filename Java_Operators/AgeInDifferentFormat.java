import java.util.Scanner;
public class AgeInDifferentFormat {
  public static void main(String [] args){
    Scanner input= new Scanner(System.in);

  System.out.println("Enter your age in years");
    int age =input.nextInt();

System.out.println("Your age: " + age + " years");
System.out.println("Your age: " + age * 12 + " months");
System.out.println("Your age: " + age * 365 + " days");
System.out.println("Your age " + age * 365 * 24 + " hours old");
System.out.println("Your age: " + age * 365 * 24 * 60 + " minutes");
    
  }
}
