//wap to conver Mb to KB 1mb=1024kb
import java.util.Scanner;
public class MegaByteToKiloByte{
public static void main(String[] args){
   Scanner input=new Scanner(System.in);
  System.out.print("Enter MB: ");
  int MB=input.nextInt();
  int KB=MB*1024;
  System.out.println("Total in KiloByte: " + KB + ".KB");
  
 }
}
