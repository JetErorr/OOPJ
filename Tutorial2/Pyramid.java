// 2/6
import java.util.Scanner;
class Pyramid{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:\n");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("* ");
            }
        System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = n; k > i; k--){
                System.out.print("* ");
            }
        System.out.print("\n");//Double LineFeed
        }
        scan.close();
    }
}