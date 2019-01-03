package Tutorial1;

import java.util.Scanner;
class ArrayResult{
    public static void main(String[] args) {
        int i;
        int t=0;
        int a[];
        Scanner var = new Scanner(System.in);
        a = new int[6];
        System.out.println("Please enter the marks for 6 subjects:");
        for(i=0;i<6;i++){
            System.out.println("Subject " +i +":\n");
            a[i] = var.nextInt();
            t+=a[i];
        }
        t=t/6;
        System.out.println("The percentage of your entered marks is: " +t +"\n");
        var.close();
    }   
}