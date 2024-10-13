package L17Recursion;

public class Print5to1 {

    public static void Printno(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        Printno(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        Printno(n); 
    }
}
