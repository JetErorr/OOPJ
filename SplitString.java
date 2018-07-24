// 3/3
import java.util.Scanner;
class SplitString
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your string:\n");
        String s = Sc.nextLine();
        int n=s.length();
        System.out.println("The length of the string is = "+ n);
        System.out.print("and the second half of the string is: ");
        for(int i=n/2;i<n;i++)
        {
            System.out.print(s.charAt(i));
        }
        Sc.close();
    }
}
