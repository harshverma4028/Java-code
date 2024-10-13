import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c= a-b;
            System.out.println("Enter choose \n 1 for addition \n 2 for sub \n 3 for mul  \n 4 for div \n 5 for modulus" );
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("addition = "+ a+b);
                    break;
                case 2:
                    System.out.println("sub= "+ c);
                    break;
                case 3:
                    System.out.println("mul = "+ a*b);
                    break;
                case 4:
                    System.out.println("div"+ a/b);
                    break;
                case 5:
                    System.out.println("modulus"+ a%b);
                default:
                    System.out.println("Enter valid input");
            }
        }
     
     }      
}
