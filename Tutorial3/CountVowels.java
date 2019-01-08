package Tutorial3;

// 3/2
import java.util.Scanner;
class CountVowels{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String a = Sc.nextLine();
        int vow=0,cons=0;
        char s;
        for(int i=0;i<a.length();i++){   
            s=a.charAt(i);
            if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u') {
                vow++;
            }
	    else if(s>='a' && s<='z'){
                cons++;
            }
        }
        System.out.println("There are "+ vow +" vowels and "+ cons +" consonents in your string");
        Sc.close();
    }
}