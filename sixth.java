import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int n=5;


        //upper half
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //     }
        

        //     // spaces
        //     int spaces=2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //        System.out.print(" ");
        //     }

        //      // 2nd half
        //     for(int j=1;j<=i;j++){
        //        System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // //loweer half
        // for(int i=n;i>=1;i--){
        //     //1st part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     //spaces
        //     int spaces =2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     // second half
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

             //12th pattern

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     //spaces 
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     //print row no , row no times
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        
        // 13th pattern

        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //first part
            for(int  j=i;j>=1;j--){
                System.out.print(j);
            }

            //second part 
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
