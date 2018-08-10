public class Recursion{
    int power(int n, int m){
        if(m==1){return n;}
        else{return n*power(n, m-1);}
    }
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        System.out.println("5^3= "+obj.power(5, 3));
    }
}