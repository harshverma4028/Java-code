package L11Array2D;

import java.util.Scanner;

public class searching {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();

        int numbers[][]=new int[rows][col];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if (numbers[i][j]==x) {
                    System.out.println("The value of x is found at ("+i+","+j+")");
                }
            }
        }
    }
}
