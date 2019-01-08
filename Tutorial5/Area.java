package Tutorial5;

abstract class shape {
    abstract void area();
}
class triangle extends shape{
    float a=12,c=5;
    void area(){
		System.out.println("Area is: "+((a/2)*c));
    }
}
class rectangle extends shape{
    float a=10,b=20;
    void area(){
        System.out.println("Area is: "+a*b);
    }
}
class circle extends shape{
    double r=2.5,pi=3.14;
    void area(){
        System.out.println("Area is: "+pi*(r*r));
    }
}
class Area{
    public static void main(String[] args) {
        triangle t = new triangle();
        rectangle r = new rectangle();
        circle c = new circle();
        t.area();
        r.area();
        c.area();
    }
}