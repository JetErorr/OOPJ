import java.util.Scanner;
class sqrt{
    public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Enter the value of n: \n");
    int n = var.nextInt();
    int i,j,flag=0;
    for(i=2;i<n;i++){
        flag=0;
        for(j=2;j<Math.sqrt(n);j++){
            if(i%j==0)
            {flag=1;}
        }
            if(flag == 0){ System.out.println("I: " +i +" is a prime number.!"); }
    }
    var.close();
    }
}