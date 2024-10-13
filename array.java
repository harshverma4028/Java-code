import java.util.*;
public class array {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int [] numbers=new int[size];
        System.out.println("Enter the Elements for array: ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("the array is you have entered :");

        for(int i=0; i<size;i++){
            System.out.print(numbers[i]+" ");

        }
        
    }
}
