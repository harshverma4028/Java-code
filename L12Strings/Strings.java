package L12Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstname="harsh";
        String lastname="Verma";

        String fullname=firstname+lastname;

        System.out.println(firstname+" "+lastname);

        // System.out.println(fullname.length());
        // for(int i=0;i<fullname.length();i++){
        //     System.out.println(fullname.charAt(i));
        // }

        String name1="harsh";
        String name2="harsh";
        // if (name1.equals(name2)) {
        //     System.out.println("they are smae string");
        // }else{
        //     System.out.println("they are not equal");
        // }

        // if (name1 == name2) {
        //     System.out.println("They Strings are same");
        // }else{
        //     System.out.println("They strings are not same");
        // }

        //Gives Incorrect Input

        // if (new String("tony")==new String("tony")) {
        //     System.out.println("They are same String");
        // }else{
        //     System.out.println("They are different String ");
        // }

        // if (name1.compareTo(name2)==0) {
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        //                   substrings

       /*  String sentence="My name is Harsh";
        String name=sentence.substring(11,sentence.length());
        System.out.println(name);

        */


        //Pasrsent method to integer class

     /*    String str="123";
        int number =Integer.parseInt(str);
        System.out.println(number);

       */


       //To String Method of String class

       /* int number=123;
       String str=Integer.toString(number);
       System.out.println(str.length());
       */



    }
}
