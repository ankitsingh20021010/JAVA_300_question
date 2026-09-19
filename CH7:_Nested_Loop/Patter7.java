//wap 1 2 3 4 5 /n 2 4 6 8 10/n 3 6 9 12 15 /n 4 8 12 16 20 /n 5 10 15 20 25 /n
public class Pattern7{
    public static void main(String[] args){
        int multiplier=1, numOfRows=5;
        for(int i=1; i<=numOfRows; i++){
            for(int j=1; j<=numOfRows; j++){
                System.out.print(j* multiplier + " ");
            }
            multiplier++;
            System.out.println("");
        }
    }
}
