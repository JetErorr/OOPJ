//Write a java app that converts dollars to rupess 1$=68.69rs
import java.util.Scanner;
class Convert{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of Dollars");
        double dollars = scan.nextDouble();
        double rs = dollars * 68.69;
        // double dollars = rs / 68.69;
        System.out.println(dollars+ " Dollars will be equal to "+rs+" Rupees");
        scan.close();
    }
}