package LECTURES.Recursion;

public class CountTotalPaths {
    public static int countTotalPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int downPaths = countTotalPaths(i+1, j, n, m);

        //move right
        int rightPaths = countTotalPaths(i, j+1, n, m);

        return downPaths + rightPaths;

    }
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(countTotalPaths(0, 0, n, m));
    }
}
