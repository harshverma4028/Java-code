package L18Recursion2;
import java.util.HashSet;

public class UniqSubSeq {
    public static void PrintSubseq(String str,int idx,String res,HashSet<String>allsubseq){
        if (idx==str.length()) {
            if (allsubseq.contains(res)) {
                return;
            }
            allsubseq.add(res);
            System.out.println(res);
            return;
        }
        //choose
        PrintSubseq(str, idx+1, res+str.charAt(idx), allsubseq);

        //don't choose
        PrintSubseq(str, idx+1, res, allsubseq);
    }

    public static void main(String[] args) {
        String str1="abc";
        String str2="aaa";
        HashSet<String>allsubseq=new HashSet<>();
        PrintSubseq(str2, 0, "", allsubseq);
    }
}
