//WAP to if input java print J J J J /n A A A A /n V V V V /n A A A A
import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
        System.out.print("Enter STR: ");
        String str=input.next();
        for(int i=0; i<4; i++){
            for(int j=0; j<str.length(); j++){
                System.out.print(str.charAt(i)+" ");
                
            }  
            System.out.println("");
        } 
    }
}
