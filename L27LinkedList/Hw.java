package L27LinkedList;
import java.util.*;

import L17Recursion.fibonacci;

public class Hw {
    public static void main(String[] args) {
        // LinkedList<Integer> list=new LinkedList<Integer>();


        // list.add(1);
        // list.add(5);
        // list.add(7);
        // list.add(3);
        // list.add(8);
        // list.add(2);
        // list.add(3);

        // System.out.println(list);

        // for(int i=0;i<list.size();i++){
        //     if (list.get(i)==7) {
        //         System.out.println("the Element found at index "+i);
        //     }
        // }

        LinkedList <Integer> list2=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();


        for(int i=0;i<4;i++){
            list2.add(i,sc.nextInt());
        }

        System.out.println(list2);

        for(int i=0;i<list2.size();i++){
            if ((int) list2.get(i)>25) {
                list2.remove(i);
            }
        }


        for (int i = list2.size() - 1; i >= 0; i--) {
             if ((int) list2.get(i) > 25) {
                 list2.remove(i);
                }
        }

        System.out.println(list2);



        // while (<list2.size()) {
            
        // }

    }
}
