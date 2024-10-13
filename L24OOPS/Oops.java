package L24OOPS;

/**
 * pen
 */
class pen {   
    String color;
    public void printColor(){
        System.out.println("the color of this pen is "+this.color);
    }
}
public class Oops {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.color="blue";

        pen p2=new pen();
        p2.color="black";

        pen p3=new pen();
        p3.color="red";

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
