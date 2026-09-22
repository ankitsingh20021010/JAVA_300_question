//WAP ReverseString like ANKIT--> TIKNA 

public class ReverseString{
  public static void main(String[] args){
    String name="ANKIT";
      System.out.print(name+"---> ");
    for(int i=name.length()-1; i>=0; i--){
      System.out.print(name.charAt(i));
    }
  }
}
