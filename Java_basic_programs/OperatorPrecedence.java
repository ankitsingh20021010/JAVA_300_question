public class OperatorPrecedence{
    public static void main(String[] args){
      int a=15, b=5, c=3, result;
      result=a/c*b+b*a/c-a*c;
      System.out.println(result);
    }
}
// 1--> () , 2 --> * / % , 3----> + -  
