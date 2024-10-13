package L24OOPS;
abstract class Animal{
    abstract void walk();
    void breath(){
        System.out.println("ths animal breath air");
    }
    Animal(){
        System.out.println("You are about to create an animal class");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("wow, you have created a Horse");
    }
    void walk(){
        System.out.println("Horse walk on 4 leg ");
    }
}

class Chiken extends Animal{
    Chiken(){
        System.out.println("wow you have created chiken");
    }
    void walk(){
        System.out.println("chiken walk on 2 legs");
    }
}
public class AbastactCls {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        horse.breath();
    }
}
