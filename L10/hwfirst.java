import java.util.*;
public class hwfirst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Array ka size bol");
        int size=sc.nextInt();
        String name[]=new String[size];

        //input
        System.out.println(" chal naam bol nam : ");

        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }
        
        System.out.println("le tera naam ");
        for(int i=0;i<size;i++){
            System.out.println("names:"+(i+1)+name[i]);
        }

    }
}
