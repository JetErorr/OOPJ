package Tutorial4.ProjectJava.src;

class Calls {
    int i;
    Calls(){
        i=20;
    }
    void addVal(int var){
        System.out.println("Var: The old value of var is: "+var);
        var++;
        System.out.println("Var: The new value of var is: "+var);
    }
    void addRef(Calls obj){
        System.out.println("Ref: The old value is: "+obj);
        System.out.println("Var: The old value of var is: "+obj.i);
        obj.i++;
        System.out.println("Var: New value of var is: "+obj.i);
    }
    public static void main(String[] args) {
        Calls obj1 = new Calls();
        Calls obj2 = new Calls();
        System.out.println("Obj1: Value is: "+obj1);
        System.out.println("Obj2: Value is: "+obj2);
        System.out.println("Obj2.i: Value before increment is: "+obj2.i);
        obj1.addRef(obj2);
        System.out.println("Obj2.i: Value after increment is: "+obj2.i);
        obj1.addVal(obj2.i);
        System.out.println("Obj2.i: Value after increment is: "+obj2.i);        
    }
}