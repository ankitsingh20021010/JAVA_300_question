//WAP to check given number is prime or not until user enter "NO"
import java.util.Scanner;
public class CheckPrime{
  public static void main(String[] args){
       Scanner input=new Scanner(System.in);
    int userChoice;
    do{
        System.out.print("Enter num");
    int num=input.nextInt(), count=0;
    for(int i=1; i<=num; i++){
       if(num%i==0){
       count++;
       }
    }
     if(count==2){
       System.out.println("--->Prime Number");
    }
      else{
      System.out.println("**Not Prime Number**");
      }
      System.out.println("Do you want to perform More operation?");
      System.out.println("Press 1 for yes");
      System.out.println("Press 2 for NO");
      userChoice=input.nextInt();
      }while(userChoice==1);
  }
}
