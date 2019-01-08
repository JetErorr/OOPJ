package Tutorial4.ProjectJava.src;

public class Box {
    int h,w,l;
    Box(){
        h=10;
        w=10;
        l=10;
    }
    void display(){
        System.out.println("\nThe total volume of the box is: "+h*w*l);
    }
    public static void main(String[] args) {
        Box obj1 = new Box();
        obj1.display();
    }
}