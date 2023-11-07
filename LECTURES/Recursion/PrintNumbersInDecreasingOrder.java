package LECTURES.Recursion;

public class PrintNumbersInDereasingOrder {
    public static void printNumbersInDecreasingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNumbersInDecreasingOrder(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printNumbersInDecreasingOrder(n);
    }
}
