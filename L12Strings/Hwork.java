package L12Strings;
import java.util.Scanner;
import java.util.*;

public class Hwork {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        String array[]=new String[size];
        int totlength=0;

        for(int i=0;i<size;i++){
            array[i]=sc.next();
            totlength +=array[i].length();
        }
        System.out.println(totlength);

    }
}
