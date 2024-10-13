import java.util.Scanner;

public class  fourth{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        // for(int i =0; i < 11;i++){
        //     System.out.println(i);
        // }
        
        // int p=0;
        // while(p<12){
        //     System.out.println(p);
        //     p++;
        // }
        
        // int q=0;
        // do{
        //     System.out.println(q);
        //     q++;
        // }while(q<13);

        // int n = sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum =sum+i;
        //     System.out.println(sum);
        // }

        // int n= sc.nextInt();
        // int i;
        // for(i=1;i<11;i++){
        
        //     System.out.println(i*n);
        // }

        // int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }
/*         float input;
        do{
            float marks=Sc.nextFloat();
            if(marks>=90 && marks <= 100){
                System.out.println("This is good");
            }else if(marks >= 60 && marks <= 89){
                System.out.println("this is also good");
            }else if(marks >= 0 && marks <= 59){
                System.out.println("this is good as well");
            }else{
                System.out.println("Invalid");
            }
            

            System.out.println("Want to continue ? yes(1) no(0)");
            input= Sc.nextFloat();
            
        }while(input==1);
    }
}
*/
public class fourth{
    public static void main(String[] args){
        int n=5;
        for(int i=5;i<=n;i++){
        for(int j=5;j<=i;j++){
            System.out.print("*");
        }
System.out.println(" ");

        }
        
    }
