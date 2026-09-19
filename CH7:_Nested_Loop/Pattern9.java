//WAP to print AAAAA /n B B B B B /n C C C C C /n D D D D D /n  E E E E E /n
public class Patterm8{
  public static void main(String[] args){
      int NumOfRows=5;
      char ch='A';
      for(int i=1; i<=NumOfRows; i++){
          for(int j=1; j<=NumOfRows; j++){
              System.out.print(ch + " ");
          }
          ch=(char)(ch+1);
          System.out.println("");
      }
  }
 }
