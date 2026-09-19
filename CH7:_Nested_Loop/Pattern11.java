//WAP to print 10000 /n 010000 /n 001000 /n 000100 /n 000010 /n 

public class PAttern11{
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
               if(i==j){
                   System.out.print("1");
               }
                else{
                    System.out.print("0");
                }
               
            }
             System.out.println(" ");
        }
    }
}
