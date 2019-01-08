package Tutorial4.ProjectJava.src;

public class Overload {
    void test(){
        System.out.println("No Argument");
    }
    void test(int a){
        System.out.println("1 Integer Argument. A: "+a);
    }
    void test(int a,int b){
        System.out.println("2 Integer Arguments. A: "+a+" B: "+b);
    }
    void test(long a){
        System.out.println("1 Long Argument. A: "+a);
    }
    void test(float a){
        System.out.println("1 Float Argument. A: "+a);
    }
    void test(double a){
        System.out.println("1 Double Argument. A: "+a);
    }
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.test();
        obj.test(12);
        obj.test(15,19);
        obj.test(20l);
        obj.test(21f);
        obj.test(22.);
    }
}