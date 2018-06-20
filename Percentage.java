// Write a java program that calculates percentage marks of a student
// with marks of 6 subjects
import java.util.Scanner;
class Percentage{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks for OOPJ");
        int a = scan.nextInt();
        System.out.println("Enter the marks for DE");
        int b = scan.nextInt();
        System.out.println("Enter the marks for AnDA");
        int c = scan.nextInt();
        System.out.println("Enter the marks for CG");
        int d = scan.nextInt();
        System.out.println("Enter the marks for SP");
        int e = scan.nextInt();
        System.out.println("Enter the marks for Cyber Security");
        int f = scan.nextInt();
        int percentage = (a +b +c +d +e +f) /6;
        System.out.println("The percentage marks are " +percentage +"%");
        scan.close();
    }
}