//WAP to print Pattern 54321 /n 54321 /n 54321 /n 54321 /n 54321 /n
public class pattern6{
    public static void main(String[] args){
        int numOfRows=5;
        for(int i=numOfRows; i>=1; i--){
            for(int j=5; j>=1; j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
