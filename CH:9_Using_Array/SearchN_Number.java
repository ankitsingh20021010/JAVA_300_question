//find element in array

import java.util.Scanner;
public class searchN_Number{
    public static void main(String[] args){
        int []arr={12,63,43,65,65,32,45,33,78};
        int n ,m=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter to find (n): ");
        n=input.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                System.out.print("Yes number N: " + n + " is Avilable in array. ");
                m++;
            break;  
            }
             
        }
        if(m==0){
            System.out.println("Not Found !");
        }
       
    }
}
