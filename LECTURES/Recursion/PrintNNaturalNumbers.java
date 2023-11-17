package LECTURES.Recursion;

public class PrintNNaturalNumbers {
    public static void printNNaturalNumbers(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printNNaturalNumbers(i+1, n, sum);
    }
    public static void main(String[] args) {
        printNNaturalNumbers(1, 5, 0);
    }
}
