public class Overload{
        int w, h, l;
        Overload(){
            w=10;h=20;l=30;
        }
        Overload(int a,int b,int c){
            w=a;h=b;l=c;
        }
        Overload(Overload object){
            w=object.w;
            h=object.h;
            l=object.l;
        }
        int getVolume(){
            return w*h*l;
        }
    public static void main(String[] args){
        Overload obj0 = new Overload();
        Overload obj1 = new Overload(200,300,400);
        Overload obj2 = new Overload(obj0);
        System.out.println("OBJECT 0: "+obj0.getVolume());
        System.out.println("OBJECT 1: "+obj1.getVolume());
        System.out.println("OBJECT 2: "+obj2.getVolume());

        System.out.println("Ref (OBJECT0): "+obj0);
        System.out.println("Ref (OBJECT2): "+obj2);
    }
}