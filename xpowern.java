import java.util.*;
public class xpowern {
    public static void power(int x,int n,int result){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x :");
        x=sc.nextInt();
        System.out.println("Enter the value of n :");
        n=sc.nextInt();
        result =1;
        for(int i=0;i<n;i++){
            result=result*x;

        }
        System.out.println("the power of x to the n is :"+result);
 
    }

    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter the value of x :");
     //   int x=sc.nextInt();
     //   System.out.println("Enter the value of n :");
     //   int n=sc.nextInt();
        power(0, 0, 0);
    }
}