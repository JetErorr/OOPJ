import java.util.Scanner;
class Add{
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a+b;
        System.out.println("The sum of the two numbers " + s);
        sc.close();
    }
}