public class Func {
    public static void printFactorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
            System.out.println(fact);
        }
    }

    public static void main(){
        int n=5;

        printFactorial(n);
    }
}
