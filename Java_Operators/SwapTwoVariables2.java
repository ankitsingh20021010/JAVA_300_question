public class SwapTwoVariables2{
      public static void main(String [] args){
      int num1=10, num2=100; 
        num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;

  System.out.println("Values after Swapping");
        System.out.println(num1);
        System.out.println(num2);
      }
}
