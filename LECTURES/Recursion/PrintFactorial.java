package LECTURES.Recursion;

public class PrintFactorial {
    public static int printFactorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = printFactorial(n-1);
        int fn = n * printFactorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
    }
}
