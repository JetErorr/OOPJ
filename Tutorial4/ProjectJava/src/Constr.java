package Tutorial4.ProjectJava.src;

class Box {
    int h,w,l;
    Box(){
        h=1;w=10;l=10;
    }
    Box(int a,int b,int c){
        h=a;l=b;w=c;
    }
    void display(){
        System.out.println("The total volume of the box is: "+h*l*w);
    }
}

class Constr{
    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj2 = new Box(25,10,15);
        obj1.display();
        obj2.display();
    }
}