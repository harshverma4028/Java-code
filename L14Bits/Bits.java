package L14Bits;
public class Bits {
    public static void main(String[] args) {
        int n=5;   //0101
        int pos=3;
        int bitMask=1<<pos;

        if ((bitMask & n)==0) {
            System.out.println("bit was zero");
        }else{
            System.out.println("the bit was one");
        }
    }
}
