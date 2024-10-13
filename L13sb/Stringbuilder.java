package L13sb;

public class Stringbuilder {
    public static void main (String args[]){
        StringBuilder sb=new StringBuilder("Harsh");
        /* System.out.println(sb);
        // System.out.println(sb.charAt(0));

        sb.setCharAt(0,'v');
        System.out.println(sb);

        sb.insert(0, 'k');
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.append("verma");
        System.out.println(sb);


        System.out.println(sb.length());
        */

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
