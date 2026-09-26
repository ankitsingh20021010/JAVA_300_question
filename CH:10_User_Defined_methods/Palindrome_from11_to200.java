//wap to create a method/funtion to print a range to palindrome number 

public class Palindrome_from11_to200{
  public static void main(String[] args){
    
    for(int i=11; i<=200; i++){
      if(isPalindromeNumber(i)){
        System.out.print(i + " " );
      }
    }
  }
  static boolean isPalindromeNumber(int num){
    int reverse=0, lastDigit, originalNum=num;
    while(num!=0){
      lastDigit=num % 10; 
      reverse = reverse * 10 + lastDigit;
      num=num/10;
    }
    if(reverse==originalNum){
      return true;
    }
    else{
      return false;
    }
  }
}
