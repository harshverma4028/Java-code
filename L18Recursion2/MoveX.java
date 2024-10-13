package L18Recursion2;

public class MoveX {
    public static String addx(int Count){
        String newStr="x";
        for(int i=1;i<Count;i++){
            newStr+="x";
        }
        return newStr;       
    }
    public static String moveAllx(String str,int idx,int Count){
        if (idx==str.length()) {
            return addx(Count);
        }
        if (str.charAt(idx)=='x') {
            return moveAllx(str, idx+1, Count+1);
        }else{
            String nweString=moveAllx(str, idx+1, Count);
            return str.charAt(idx)+nweString;
        }
    }
    public static void main(String[] args) {
        String str="abcdxfghbxjklxminxpoqrxhghxlmcx";
        int Count=0;

        String nweString=moveAllx(str, 0, Count);
        System.out.println(nweString);
    }
}
