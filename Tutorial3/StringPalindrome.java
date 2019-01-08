package Tutorial3;

// 3/4
import java.util.Scanner;   
class StringPalindrome{  
   public static void main(String args[]){
      String str, rev=""; 
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter your string");  
      str = in.nextLine();   
      int length = str.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         rev= rev + str.charAt(i);  
      if (str.equals(rev)){
         System.out.println("Your String is a Palindrome.!");}
      else{
         System.out.println("Your String is not a Palindrome");}
         in.close();
   }  
} 