package L17Recursion;

public class Print1to6 {
    public static void Print(int n){
        if (n==66) {
            return;
        }
        System.out.println(n);
        Print(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        Print(n);
    }
}
