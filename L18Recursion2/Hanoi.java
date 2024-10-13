package L18Recursion2;

public class Hanoi {
    public static void towerOfHanoi(int n, String src,String halper,String dest){
        if (n==1) {
            System.out.println("transfer disk "+n+"from "+src+" to "+dest);
            return ;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src,dest, halper);

        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + halper);

        //transfer n-1 from helper to dest using src as 'helper
        towerOfHanoi(n-1, halper,src, dest);
    }
    public static void main(String[] args) {
        int n=5;
        towerOfHanoi(n,"S","H","D");
    }
}
