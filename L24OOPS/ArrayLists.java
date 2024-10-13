package L24OOPS;
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<Integer>();
        ArrayList <String> list2 =new ArrayList<String>();
        ArrayList <Boolean> list3=new ArrayList<Boolean>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //to get an element
        int element=list.get(3);
        System.out.println(element);

        //add element in between
        list.add(0,2);
        System.out.println(list);

        //set elemet
        list.set(0, 0);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size of list
        int size=list.size();
        System.out.println(size);

        //Loops on lists
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

        //sorting the list
        list.add(0);
      //  Collections collection;
      //  short
        Collections.sort(list);
        System.out.println(list);
    }
}


