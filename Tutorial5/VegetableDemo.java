package Tutorial5;

abstract class Vegetable {
    String color;
    abstract public String toString();
}
class Potato extends Vegetable{
    public String toString(){
        color="White";
        return color;
    }
}
class Tomato extends Vegetable{
    public String toString(){
        color="Red";
        return color;
    }
}
class Brinjal extends Vegetable{
    public String toString(){
        color="Purple";
        return color;
    }
}
class VegetableDemo{
    public static void main(String []args){
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();
        System.out.println("Color of Potato is: "+p.toString());
        System.out.println("Color of Tomato is: "+t.toString());
        System.out.println("Color of Brinjal is: "+b.toString());
    }
}