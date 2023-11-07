package LECTURES.Recursion;

public class PrintNumbersInIncreasingOrder {
    public static void printNumbersInIncreasingOrder(int n){
        if(n==1){
            System.out.print(n+" ");//increase
            return;
        }
        printNumbersInIncreasingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printNumbersInIncreasingOrder(n);
    }
}
