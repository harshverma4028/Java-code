package L19Recursion3;

public class PathMaze {
    public static int CountPath(int i,int j,int m,int n){
        if (i==m-1 || j==n-1) {
            return 1;
        }

        return CountPath(i+1, j, m, n)+CountPath(i, j+1, m, n);
    }

    public static void main(String[] args) {
        int m=4,n=5;
        System.out.println(CountPath(0, 0, m, n));
    }
}
