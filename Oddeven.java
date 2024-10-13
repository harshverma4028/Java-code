import java.util.*;
public class Oddeven {
    public static void EvenOdd(int num){
        if (num%2==0) {
            System.out.println(num+"is Even number");
        }
        else{
            System.out.println(num+"is Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        EvenOdd(num);
    }
}
