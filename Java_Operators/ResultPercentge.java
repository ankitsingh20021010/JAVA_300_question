//wap to print percentage of result 

import java.util.Scanner;
public class ResultPercentge{
public static void main(String[] args){
int marks1,marks2,marks3;
  double percentage;
  Scanner input=new Scanner(System.in);
  System.out.print("Enter marks1: ");
  marks1=input.nextInt();

  System.out.print("Enter marks2: ");
  marks2=input.nextInt();

  System.out.print("Enter marks3: ");
  marks3=input.nextInt();
  
int total_marks=marks1 + marks2 + marks3;
  percentage= (total_marks / 3);
  System.out.println("Percentage is: " + percentage + "%");
}
}
