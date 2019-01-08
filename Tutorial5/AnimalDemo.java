package Tutorial5;

interface Transport {
    void deliver();
}
abstract class Animal{
abstract void show();
}
class Tiger extends Animal{
    void show(){}
}
class Deer extends Animal{
    void show(){}
}
class Camel extends Animal implements Transport{
    void show(){
        deliver();
    }
public void deliver(){
    System.out.println("Camel is used as a Delivery Animal.");
}
}
class Donkey extends Animal implements Transport{
    void show(){
        deliver();
    }
public void deliver(){
    System.out.println("Donkey is used as a Delivery Animal.");
}
}
class AnimalDemo{
    public static void main(String[] args) {
        Animal[] a = new Animal[4];
        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof Transport){
                a[i].show();
            }
        }
    }
}