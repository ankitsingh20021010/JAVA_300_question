//WAP to print 0000 and 111 in all center possition like this 
public class Pattern12{
  public static void main(String[] args){
    int NumOfRows=5;
    for(int i=0; i<=NumOfRows; i++){
   for(int j=0; j<=NumOfRows; j++){
   if(i==0 || i==NumOfRows || j==0 || j==NumOfRows){
     System.out.print("0");
   }
     else{
       System.out.print("1");
     }
   }
      System.out.println("");
    
  }
  }
}
