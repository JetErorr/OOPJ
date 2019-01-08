package Tutorial1;

// Write a program that defines a floating point variable 
// Initialized with a ($)Dollar value for your income
// And another floating point variable with value 
// Corresponding to the tax rate of 35%
// Use both rupees and dollars
// Rs68.57=1Dollar
// Use two integers to hold tax rupees and paisa
// Dollar -> 35% -> Tax -> Rupees : Rupees and Paisa
import java.util.Scanner;
class Float{
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int rupees, paise;
        float income;
        System.out.println("Enter your income in USD: ");
        income = var.nextFloat();
        float tax = income * (float)0.35;
        System.out.println(tax);
        rupees = (int)tax;
        paise = (int)((tax - (int)tax)*10000);
        System.out.println("Rupees: "+rupees);
        System.out.println("Paise: "+paise);
        var.close();
    }
}