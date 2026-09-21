//WAP to print NAME like ANKIT /n ANKI /n ANK /n AN /n A 

import java.util.Scanner;
public class Pattern14{
public static void main(String[]args){
  Scanner input=new Scanner(System.in);
  System.out.print("Enter String like Name: ");
  String str=input.next();
    for(int i=str.length()-1; i>=0; i--){
      for(int j=0; j<=i; j++){
        System.out.print(str.charAt(j));
      }
      System.out.println();
    }
}
}
