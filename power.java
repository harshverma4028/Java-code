import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x=sc.nextInt();
        System.out.println("Enter the value of N: ");
        int n=sc.nextInt();
        int result=1;
        
        for(int i=0;i<n;i++){
            result=result*x;
        }
        System.out.println("X to the power of n is : "+result);
        
    }
}
