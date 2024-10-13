import java.util.*;

public class fifth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int a=4;
        // int b=5;
        // for( int i=1;i<=a;i++){
        //     for(int j=1;j<=b;j++){
        //         if(i==1 || j==1 || i==a || j==b){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n=4;

        // for(int i=n;i>=1;i--){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // 5th pattern

        // int n=4;

        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop stat pattern
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 6th pattern 

        // int n=sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 7th pattern 

        // int n=10;

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 8th pattern

        // int n=5;
        // int number=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum % 2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }





    }
    
}
