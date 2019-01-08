package Tutorial4.ProjectJava.src;

public class RecursionPower {
    int power(int n, int m){
        if(m==1){return n;}
        else{return n*power(n, m-1);}
    }
    public static void main(String[] args) {
        RecursionPower obj = new RecursionPower();
        System.out.println("5^3= "+obj.power(5, 3));
    }
}