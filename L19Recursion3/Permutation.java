package L19Recursion3;

import javax.print.DocFlavor.STRING;

public class Permutation {
    public static void printPermu(String str,int idx,String permu){
        if (str.length()==0) {
            System.out.println(permu);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printPermu(newstr, idx+1, permu+currchar);
        }
    }

    public static void main(String[] args) {
        String str="harsh";
        printPermu(str, 0, "");
    }
}
