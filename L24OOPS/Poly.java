package L24OOPS;

public class Poly {
    String name = "Harsh";
    int age = 20;

    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo1(int age) {
        System.out.println(age);
    }

    public void displayInfo2(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Poly obj = new Poly(); 
        obj.displayInfo("Tarun");
        obj.displayInfo1(56);
        obj.displayInfo2("Tarun", 56);
    }
}

