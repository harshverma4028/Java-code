package L18Recursion2;

public class SubSeQuen {
    public static void printsubseq(String str,int idx,String res){
        if (idx==str.length()) {
            System.out.println(res);
            return;
        }

        //chose
        printsubseq(str, idx+1, res+str.charAt(idx));

        //don't choose
        printsubseq(str, idx+1, res);
    }

    public static void main(String[] args) {
        String str1="abc";
        String str2="aaa";

        printsubseq(str1, 0, "");
    }
}
