//wap to print sq * 
public class Pattern13{
  public static void main(String[] args){
    int NumOfRows=4;
    for(int i=0; i<=NumOfRows; i++){
   for(int j=0; j<=NumOfRows; j++){
   if(i==0 || i==NumOfRows || j==0 || j==NumOfRows){
     System.out.print("* ");
   }
     else{
       System.out.print(" ");
     }
   }
      System.out.println();
    
  }
  }
}
