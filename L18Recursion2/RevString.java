package L18Recursion2;

public class RevString {
    public static void revString(String str,int idx){
        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        revString(str, idx+1);
    }

    public static void main(String[] args) {
        String str="abcdeghijklmnopqrstuvwxyz";
        revString(str, 11);
    }
}
