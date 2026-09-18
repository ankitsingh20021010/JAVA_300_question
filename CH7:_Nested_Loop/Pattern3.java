//WAP to print 11 12 13 14 15 /n 16 17 18 19 20 /n 21 22 23 24 25 /n 

public class Pattern3{
  public static void main(String[] args){
    int NumberofRows=5, count=11;
    for(int i=1; i<=NumberofRows; i++){
      for(int j=1; j<=NumberofRows; j++){
        System.out.print(count + " ");
          count++;
      }
      System.out.println();
    }
  }
}
