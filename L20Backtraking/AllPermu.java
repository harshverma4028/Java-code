package L20Backtraking;

public class AllPermu {
    public static void printPermutaion(String str,int idx,String perm){
        if (str.length()==0) {
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            printPermutaion(newStr, idx+1, perm+currchar);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        printPermutaion(str, 0, "");
    }
}
