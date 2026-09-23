public class PrecedenceLogicOperator{
    public static void main(String [] args){
      boolean b1=true,b2=false, b3=true;
      boolean result=b1 && b2 || b3 && b2 || b2|| b3 && b1;
      System.out.println(result);
    }
}




//output
//true
