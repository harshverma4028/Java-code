package L18Recursion2;

public class RemoveDupl {
    public static String removeDuplicates(String str,int idx,boolean present[]){
        if (idx==str.length()) {
            return " ";
        }

        char curr=str.charAt(idx);
        if (present[curr-'a']) {

            return removeDuplicates(str, idx+1, present);
        }else{
            present[curr-'a']=true;
            return curr + removeDuplicates(str, idx-1, present);
        }
    }
    public static void main(String[] args) {
        String str="abcdefceghvab";
        boolean present[]=new boolean[str.length()];
        System.out.println(removeDuplicates(str,26, present));
    }
}
