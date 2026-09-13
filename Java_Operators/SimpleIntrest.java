//WAP  to calculate simple intrest based on principle,rate of intrest and number of year 
import java.util.Scanner;

public class SimpleIntrest{
    public static  void main(String [] args){
Scanner input=new Scanner(System.in);
 double principleAmount, rateOfInterest;
int noOfYears;

System.out.print("Enter Principle Amount- ");
principleAmount= input.nextDouble();

System.out.print("Enter rate of interest- ");
rateOfInterest=input.nextDouble();

System.out.print("Enter Number of Years ");
noOfYears=input.nextInt();
      double interest = principleAmount * rateOfInterest * noOfYears / 100;

  System.out.println("Simple Interest :-" + interest );
      
    }
}
