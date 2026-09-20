//WAP to take input temperature in Fahrenheit and print it inro the celsius formula: TEMP in c=(f-32)*5/9
import java.util.Scanner;
public class FahrenheitToCelsius{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    double temp;
    System.out.print("Enter Temprature in  Fahrenheit: ");
    temp=input.nextDouble();
    System.out.println("Temprature in Celsius: " + (temp -32 ) * 5/9); 
  
  }
}
