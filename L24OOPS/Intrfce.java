package L24OOPS;

interface Animal{
    void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("horse walk on 4 leg ");
    }
}

class chiken implements Animal{
    public void walk(){
        System.out.println("chiken walk on 2 leg");
    }
}
public class Intrfce {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
}
