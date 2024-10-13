package L24OOPS;
/**
 * shape
 */
                   //single inheritance
 /*                  
class shape {
    public void area(){
        System.out.println("Display area of shape");
    }
}
public class Inherit extends shape {
    public void area(int h,int b){
        System.out.println((1/2)*b*h);
    }
    public static void main(String[] args) {
        shape obj=new shape();
        obj.area();
    }
}
*/ 

               //Hierarichal inheritance
/**
 * InnerInherit
 */
class shape {
    public void area()  {
        System.out.println("Display area of shape");
    }
} 
/**
 * Traingle
 */
class Traingle extends shape {
    public void area(int h,int b)  {
        System.out.println((1/2)*b*h);
    } 
}              
public class Inherit extends shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }

    public static void main(String[] args) {
        shape obj=new shape();
        obj.area();

    }
    
}

