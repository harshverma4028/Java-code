import java.util.Scanner;

public class Functions {
    // public static int calculateProduct(int e,int f){
    //     return e*f;
    // }
    // public static int calculateSum(int c,int d){
    //     int sum1=c+d;
    //     return sum1;
    // }
    // public static void sum(int a,int b){
    //     int sum=a+b;
    //     System.out.println(sum);
    // }

    // }




    // public static void printFactorial(int n){
    //     if(n<0){
    //         System.out.println("Invalid number");
    //         return;
    //      }
    //         int fact= 1;
    //         for(int i=n;i>=1;i--){
    //             fact=fact*i;
    //         }
    //         System.out.println(fact);
    //     }
    

         // check no is prime or not


//  public static void IsPrime(int no) {
//     int temp=0;
//     for(int i=2;i<=no-1;i++){
//         if (no%i==0) {
//             temp=temp+1;
//         }
//     }
//     if(temp==0){
//         System.out.println(no+"is prime no");
//     }
//     else{
//         System.out.println(no+"is not prime");
//     }\
      public static void EvenOdd(int num){
        if(num%2==0){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
      }


      
 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        EvenOdd(num);



        // int no=sc.nextInt();
        // IsPrime(no);


       // int n=sc.nextInt();
       // printFactorial(n);
        

        // int c=sc.nextInt();
        // int d=sc.nextInt();

        // int sum1=calculateSum(c, d);
        // System.out.println("sum of c and d is : "+sum1);



        // int e=sc.nextInt();
        // int f=sc.nextInt();
        // System.out.println("the product of e and f is : "+calculateProduct(e, f));
        
      



    //   int n=sc.nextInt();
    //   printFactorial(6);

    }
}