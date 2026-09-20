
//check day by number like 1 is monday
import java.util.Scanner;

public class LadderIfElse{
    public static void main(String[] args){
        int day;
        Scanner input=new Scanner(System.in);
        System.out.print("enter day Number :- ");
            day=input.nextInt();
        if(day==0){
            System.out.println("Sunday");
        }
        else if(day==1){
            System.out.println("Monday");
        }
        
        else if(day==2){
            System.out.println("Tueday");
        }
        
        else if(day==3){
            System.out.println("Wednesday");
        }
        
        else if(day==4){
            System.out.println("Thursday");
        }
        else if(day==5){
            System.out.println("Friday");
        }
        else if(day==6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
